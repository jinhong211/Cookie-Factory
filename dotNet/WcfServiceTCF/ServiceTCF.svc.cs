using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using DAO;

namespace WcfServiceTCF
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

        public String updateAccount(String login,String passward,String type)
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

        public String addInfoAccount(String login,String nom,String prenom,int numero,String address,String exp,int cry)
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
    }
}
