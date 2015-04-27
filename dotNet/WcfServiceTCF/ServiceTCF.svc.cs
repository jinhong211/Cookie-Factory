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
            dao.addUtilisateur(login, passward, type);
            return "User" + login + "created";
        }
    }
}
