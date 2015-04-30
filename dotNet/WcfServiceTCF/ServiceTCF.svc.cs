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
                return "User " + login + " not exists";
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
                return "User " + login + " not exists";
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
                return "User " + login + " not exists";
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
    }
}
