using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DAO
{
    public class UtilisateurDAO
    {
        private static UtilisateurDAO instance;
        public static UtilisateurDAO Instance
        {
            get
            {
                if (instance == null)
                {
                    instance = new UtilisateurDAO();
                }
                return instance;
            }
        }
        /// <summary>
        /// Liste tous les utilisateurs
        /// </summary>
        public List<Utilisateur> getListUtilisateurs()
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              select utilisateur;
                return requete.ToList<Utilisateur>();
            }
        }

        /// <summary>
        /// Chercher utilisateur
        /// </summary>
        public Utilisateur getUtilisateur(String login1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                if (requete.Count() == 0)
                {
                    return null;
                }
                else
                {
                    Utilisateur u = requete.First();
                    return u;
                }
            }
        }

        /// <summary>
        /// Ajouter Utilisateur
        /// </summary>
        public void addUtilisateur(String login1, String passward1, String type1)
        {
            using (TCFModele modele = new TCFModele())
            {
                Utilisateur utilisateur = new Utilisateur
                {
                    login = login1,
                    passward = passward1,
                    type = type1
                };
                modele.Utilisateur.Add(utilisateur);
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Supprimer utilisateur
        /// </summary>
        public void removeUtilisateur(String login1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                foreach(Infomation info in u.Infomation.ToList<Infomation>()){
                    modele.Infomation.Remove(info);
                }
                foreach (Historique hist in u.Historique.ToList<Historique>())
                {
                    modele.Historique.Remove(hist);
                }
                modele.Utilisateur.Remove(u);
                modele.SaveChanges();
            }
        }
        /// <summary>
        /// Modifier utilisateur
        /// </summary>
        public void modifyUtilisateur(String login1, String passward1, String type1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                u.passward = passward1;
                u.type = type1;
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Liste tous les infoPayments de l'utilisateur
        /// </summary>
        public List<Infomation> getListInfoUtilisateur(String login1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                return u.Infomation.ToList<Infomation>();
            }
        }

        /// <summary>
        /// Un infoPayment de l'utilisateur avec numero de la carte
        /// </summary>
        public Infomation getOneInfoUtilisateur(String login1,int num1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Infomation info = u.Infomation.ToList<Infomation>().Find(e => e.numero == num1);
                return info;
            }
        }
        /// <summary>
        /// Ajout infoPayment à utilisateur
        /// </summary>
        public void addInfoToUtilisateur(String login1,String nom1,String prenom1,int numero1,String adress1,String date1,int cry)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                u.Infomation.Add(new Infomation { 
                    nom = nom1,
                    prenom = prenom1,
                    numero = numero1,
                    adress = adress1,
                    expiration = date1,
                    cryptogramme = cry
            }
                    );
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Supprime infoPayment à utilisateur
        /// </summary>
        public void deleteInfoToUtilisateur(String login1,int num1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Infomation info = u.Infomation.ToList<Infomation>().Find(e => e.numero == num1);
                modele.Infomation.Remove(info);
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Modifier infoPayment à utilisateur
        /// </summary>
        public void modifyInfoToUtilisateur(String login1,int num1, String adress1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Infomation info = u.Infomation.ToList<Infomation>().Find(e => e.numero == num1);
                info.adress = adress1;
                modele.SaveChanges();
            }
        }
        /// <summary>
        /// Liste tous les historique
        /// </summary>
        public List<Historique> getListHitorique()
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from historique in modele.Historique
                              select historique;
                return requete.ToList<Historique>();
            }
        }
        /// <summary>
        /// Liste tous les historiques de Payments de l'utilisateur
        /// </summary>
        public List<Historique> getListHistUtilisateur(String login1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                return u.Historique.ToList<Historique>();
            }
        }

        /// <summary>
        /// Un Historique de Payment de l'utilisateur avec numero de la commande
        /// </summary>
        public Historique getOneHistUtilisateur(String login1, int commande)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Historique hist = u.Historique.ToList<Historique>().Find(e => e.commande == commande);
                return hist;
            }
        }
        /// <summary>
        /// Ajout historique de Payment à utilisateur
        /// </summary>
        public void addHistToUtilisateur(String login1, int commande1, float prix1,String time1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                u.Historique.Add(new Historique
                {
                    commande = commande1,
                    prix = prix1,
                    time = time1
                }
                    );
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Supprime historique de Payment de l'utilisateur
        /// </summary>
        public void deleteHistToUtilisateur(String login1, int commande1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Historique hist = u.Historique.ToList<Historique>().Find(e => e.commande == commande1);
                modele.Historique.Remove(hist);
                modele.SaveChanges();
            }
        }

        /// <summary>
        /// Modifier historique de Payment de l'utilisateur
        /// </summary>
        public void modifyHistToUtilisateur(String login1, int commande1, float prix1, String time1)
        {
            using (TCFModele modele = new TCFModele())
            {
                var requete = from utilisateur in modele.Utilisateur
                              where utilisateur.login == login1
                              select utilisateur;
                Utilisateur u = requete.First();
                Historique hist = u.Historique.ToList<Historique>().Find(e => e.commande == commande1);
                hist.prix = prix1;
                hist.time = time1;
                modele.SaveChanges();
            }
        }
    }
}
