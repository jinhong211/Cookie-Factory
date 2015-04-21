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
        /// Ajout image à utilisateur
        /// </summary>
        public void addInfoToUtilisateur(String login1,String nom1,String prenom1,int numero1,String adress1,DateTime date1,int cry)
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
    }
}
