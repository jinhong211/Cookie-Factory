using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using DAO;
namespace ServiceTCF
{
    public class ServiceTCF : IServiceTCF
    {
        public String createAccount(String login, String passward, String type)
        {
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) == null)
            {
                dao.addUtilisateur(login, passward, type);
                return "User " + login + " created";
            }
            else
            {
                return "User " + login + " exists";
            }
        }
        public String deleteAccount(String login)
        {
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                dao.removeUtilisateur(login);
                return "User " + login + " deleted";
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
        }
        public String updateAccount(String login,String passward, String type)
        {

            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                dao.modifyUtilisateur(login, passward, type);
                return "User " + login + " updated";
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
        }
        public String loginAccount(String login, String passward)
        {
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (passward == dao.getUtilisateur(login).passward)
                {
                    return "User " + login + " login successfully";
                }
                else
                {
                    return "Wrong passward.";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
        }
        public String getListAccount()
        {
            String result = "";
            var dao = new UtilisateurDAO();
            for (int i = 0; i < dao.getListUtilisateurs().Count<Utilisateur>(); i++)
            {
                result = result + "User: " + dao.getListUtilisateurs()[i].login;
                result = result + " Passward: " + dao.getListUtilisateurs()[i].passward;
                result = result + " Type: " + dao.getListUtilisateurs()[i].type;
                result = result + "\n";
            }
            return result;
        }
        public String getListInfoAccount(String login)
        {

            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                result = result + "User: " + login + "'s payment informations:\n";
                for (int i = 0; i < dao.getListInfoUtilisateur(login).Count<Infomation>(); i++)
                {
                    result = result + "Name: " + dao.getListInfoUtilisateur(login)[i].nom;
                    result = result + " Surname: " + dao.getListInfoUtilisateur(login)[i].prenom;
                    result = result + " Card number: " + dao.getListInfoUtilisateur(login)[i].numero;
                    result = result + " Address: " + dao.getListInfoUtilisateur(login)[i].adress;
                    result = result + " Expiration date: " + dao.getListInfoUtilisateur(login)[i].expiration;
                    result = result + " Cryptogramme: " + dao.getListInfoUtilisateur(login)[i].cryptogramme;
                    result = result + "\n";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }
        public String getInfoAccount(String login,int numero)
        {
            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (dao.getOneInfoUtilisateur(login, numero) != null)
                {
                    result = result + "User: " + login + "'s payment informations of card " + numero + ":\n";
                    result = result + "Name: " + dao.getOneInfoUtilisateur(login, numero).nom;
                    result = result + " Surname: " + dao.getOneInfoUtilisateur(login, numero).prenom;
                    result = result + " Card number: " + dao.getOneInfoUtilisateur(login, numero).numero;
                    result = result + " Address: " + dao.getOneInfoUtilisateur(login, numero).adress;
                    result = result + " Expiration date: " + dao.getOneInfoUtilisateur(login, numero).expiration;
                    result = result + " Cryptogramme: " + dao.getOneInfoUtilisateur(login, numero).cryptogramme;
                    result = result + "\n";
                }
                else
                {
                    return "User " + login + "'s card: " + numero + " doesn't exist";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }
        public String addInfoAccount(String login,String nom, String prenom, int numero, String address, String exp, int cry)
        {
            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (dao.getOneInfoUtilisateur(login, numero) == null)
                {
                    dao.addInfoToUtilisateur(login, nom, prenom, numero, address, exp, cry);
                    result = result + "User: " + login + "'s payment informations of card " + numero + ":\n";
                    result = result + "Name: " + dao.getOneInfoUtilisateur(login, numero).nom;
                    result = result + " Surname: " + dao.getOneInfoUtilisateur(login, numero).prenom;
                    result = result + " Card number: " + dao.getOneInfoUtilisateur(login, numero).numero;
                    result = result + " Address: " + dao.getOneInfoUtilisateur(login, numero).adress;
                    result = result + " Expiration date: " + dao.getOneInfoUtilisateur(login, numero).expiration;
                    result = result + " Cryptogramme: " + dao.getOneInfoUtilisateur(login, numero).cryptogramme;
                    result = result + " added\n";
                }
                else
                {
                    return "User " + login + "'s card: " + numero + " already exists";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }
        public String deleteInfoAccount(String login,int numero)
        {
            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (dao.getOneInfoUtilisateur(login, numero) != null)
                {
                    dao.deleteInfoToUtilisateur(login, numero);
                    result = result + "User: " + login + "'s payment informations of card " + numero;
                    result = result + " deleted\n";
                }
                else
                {
                    return "User " + login + "'s card: " + numero + " doesn't exist";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }

        public String updateInfoAccount(String login,int numero, String address)
        {
            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (dao.getOneInfoUtilisateur(login, numero) != null)
                {
                    result = result + "User: " + login + "'s payment informations of card " + numero + ":\n";
                    result = result + "Name: " + dao.getOneInfoUtilisateur(login, numero).nom;
                    result = result + " Surname: " + dao.getOneInfoUtilisateur(login, numero).prenom;
                    result = result + " Card number: " + dao.getOneInfoUtilisateur(login, numero).numero;
                    result = result + " Address: " + dao.getOneInfoUtilisateur(login, numero).adress;
                    result = result + " Expiration date: " + dao.getOneInfoUtilisateur(login, numero).expiration;
                    result = result + " Cryptogramme: " + dao.getOneInfoUtilisateur(login, numero).cryptogramme;
                    result = result + " updated to:\n";
                    dao.modifyInfoToUtilisateur(login, numero, address);
                    result = result + "Address: " + address;
                    result = result + "\n";
                }
                else
                {
                    return "User " + login + "'s card: " + numero + " doesn't exist";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }
        public String getRoles(String username)
        {
            var dao = new UtilisateurDAO();
            return dao.getUtilisateur(username).type;
        }

        public int getID(String username)
        {
            var dao = new UtilisateurDAO();
            return dao.getUtilisateur(username).id;
        }
        public String getListHistorique()
        {
            String result = "";
            var dao = new UtilisateurDAO();
            for (int i = 0; i < dao.getListHitorique().Count<Historique>(); i++)
            {
                result = result + "User: " + dao.getListHitorique()[i].id_utilisateur;
                result = result + " Commande NO.: " + dao.getListHitorique()[i].command;
                result = result + " Shop: " + dao.getListHitorique()[i].boutique;
                result = result + " Recette: " + dao.getListHitorique()[i].recette;
                result = result + " Quantity: " + dao.getListHitorique()[i].quantite;
                result = result + " Time: " + dao.getListHitorique()[i].time;
                result = result + "\n";
            }
            return result;
        }
        public String getListHistoriqueUser(String login)
        {
            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                result = result + "User: " + login + "'s command informations:\n";
                for (int i = 0; i < dao.getListHistUtilisateur(login).Count<Historique>(); i++)
                {
                    result = result + "User: " + login;
                    result = result + " Commande NO.: " + dao.getListHistUtilisateur(login)[i].command;
                    result = result + " Shop: " + dao.getListHistUtilisateur(login)[i].boutique;
                    result = result + " Recette: " + dao.getListHistUtilisateur(login)[i].recette;
                    result = result + " Quantity: " + dao.getListHistUtilisateur(login)[i].quantite;
                    result = result + " Time: " + dao.getListHistUtilisateur(login)[i].time;
                    result = result + "\n";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }
        public String addHistAccount(String login, int commande, String boutique, String recette, int quantite, String time)
        {

            String result = "";
            var dao = new UtilisateurDAO();
            if (dao.getUtilisateur(login) != null)
            {
                if (dao.getOneHistUtilisateur(login, commande) == null)
                {
                    dao.addHistToUtilisateur(login, commande, boutique, recette, quantite, time);
                    result = result + "User: " + login;
                    result = result + " Commande NO.: " + dao.getOneHistUtilisateur(login, commande).command;
                    result = result + " Shop: " + dao.getOneHistUtilisateur(login, commande).boutique;
                    result = result + " Recette: " + dao.getOneHistUtilisateur(login, commande).recette;
                    result = result + " Quantity: " + dao.getOneHistUtilisateur(login, commande).quantite;
                    result = result + " Time: " + dao.getOneHistUtilisateur(login, commande).time;
                    result = result + "added\n";
                }
                else
                {
                    return "User " + login + "'s command: " + commande + " already exists";
                }
            }
            else
            {
                return "User " + login + " doesn't exist";
            }
            return result;
        }

        public String payment(String role, String login, int number, int cry, double prix)
        {
            var dao = new UtilisateurDAO();
            if (role == "custom")
            {
                if (10000000 >= number || number >= 99999999)
                {
                    return "wrong card number type";
                }
                else if (100 >= cry || cry >= 999)
                {
                    return "Wrong Cryptogramme code type";
                }
                else
                {
                    return "success";
                }
            }
            else if (dao.getOneInfoUtilisateur(login, number) != null)
            {
                return "success";
            }
            else
            {
                return "card not exist";
            }
        }
    }
}