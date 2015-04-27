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
            String loginfaut = "add";
            var dao = new UtilisateurDAO();

            Utilisateur utilisateur1 = dao.getUtilisateur(login);
            Utilisateur utilisateur2 = dao.getUtilisateur(loginfaut);

            Assert.IsNotNull(utilisateur1);
            Assert.IsNull(utilisateur2);
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

        [TestMethod]
        public void TestDelete()
        {
            String login = "admin";
            var dao = new UtilisateurDAO();
            dao.removeUtilisateur(login);
            Utilisateur utilisateur = dao.getUtilisateur(login);

            Assert.IsNull(utilisateur);
        }

        [TestMethod]
        public void TestUpdate()
        {
            String login = "admin";
            String passward = "passward";
            String type = "USER";
            var dao = new UtilisateurDAO();
            dao.modifyUtilisateur(login, passward, type);
            Utilisateur utilisateur = dao.getUtilisateur(login);

            Assert.AreEqual(login, utilisateur.login);
            Assert.AreEqual(passward, utilisateur.passward);
            Assert.AreEqual(type, utilisateur.type);
        }
        [TestMethod]
        public void TestGetInfo()
        {
            String login = "admin";
            var dao = new UtilisateurDAO();
            List<Infomation> list = dao.getListInfoUtilisateur(login);

            Assert.IsNotNull(list);
        }

        [TestMethod]
        public void TestGetInfoOne()
        {
            String login = "admin";
            int num = 12345;
            int num2 = 123;
            var dao = new UtilisateurDAO();
            Infomation info = dao.getOneInfoUtilisateur(login, num);
            Infomation infoNull = dao.getOneInfoUtilisateur(login, num2);
            Assert.IsNotNull(info);
            Assert.IsNull(infoNull);
        }

        [TestMethod]
        public void TestAddInfo()
        {
            String login = "admin";
            String nom = "jin";
            String prenom = "hong";
            int num = 11111;
            String address = "antibes";
            String date = "09/17";
            int cry = 123;
            var dao = new UtilisateurDAO();
            dao.addInfoToUtilisateur(login, nom, prenom, num, address, date, cry);
            Infomation info = dao.getOneInfoUtilisateur(login,num);
            Assert.AreEqual(nom, info.nom);
            Assert.AreEqual(prenom, info.prenom);
            Assert.AreEqual(num, info.numero);
            Assert.AreEqual(address, info.adress);
            Assert.AreEqual(date, info.expiration);
            Assert.AreEqual(cry, info.cryptogramme);
        }

        [TestMethod]
        public void TestDeleteInfo()
        {
            String login = "admin";
            int num = 12345;
            var dao = new UtilisateurDAO();
            dao.deleteInfoToUtilisateur(login, num);
            Infomation info = dao.getOneInfoUtilisateur(login, num);
            Assert.IsNull(info);
        }
    }
}
