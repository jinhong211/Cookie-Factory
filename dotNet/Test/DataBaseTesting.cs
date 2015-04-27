using System;
using DAO;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Test
{
    [TestClass]
    public class DataBaseTesting : DbTestBase
    {
        [TestMethod]
        public void TestGet()
        {   
            var dao = new UtilisateurDAO();
            List<Utilisateur> utilisateurList = dao.getListUtilisateurs();

            Assert.IsNotNull(utilisateurList);
        }

        [TestMethod]
        public void TestGetOne()
        {
            String login = "admin";
            var dao = new UtilisateurDAO();
            Utilisateur utilisateur = dao.getUtilisateur(login);

            Assert.IsNotNull(utilisateur);
        }

        [TestMethod]
        public void TestAdd()
        {
            String login = "jinhong";
            String passward = "jinhong";
            String type = "USER";
            var dao = new UtilisateurDAO();
            dao.addUtilisateur(login, passward, type);
            Utilisateur utilisateur = dao.getUtilisateur(login);

            Assert.IsNotNull(utilisateur);
            
        }


    }
}
