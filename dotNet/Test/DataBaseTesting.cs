﻿using System;
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
            int num = 12345678;
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
            int num = 11111111;
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
            int num = 12345678;
            var dao = new UtilisateurDAO();
            dao.deleteInfoToUtilisateur(login, num);
            Infomation info = dao.getOneInfoUtilisateur(login, num);
            Assert.IsNull(info);
        }

        [TestMethod]
        public void TestUpdateInfo()
        {
            String login = "admin";
            int num = 12345678;
            String address = "valbonne";
            var dao = new UtilisateurDAO();
            dao.modifyInfoToUtilisateur(login, num, address);
            Infomation info = dao.getOneInfoUtilisateur(login, num);
            Assert.AreEqual(address, info.adress);
        }
        [TestMethod]
        public void TestGetListHist()
        {
            var dao = new UtilisateurDAO();
            List<Historique> historiqueList = dao.getListHitorique();

            Assert.IsNotNull(historiqueList);
        }

        [TestMethod]
        public void TestGetUserHistoriqueList()
        {
            String login = "admin";
            var dao = new UtilisateurDAO();
            List<Historique> list = dao.getListHistUtilisateur(login);

            Assert.IsNotNull(list);
        }

        [TestMethod]
        public void TestGetHistoriqueOne()
        {
            String login = "admin";
            int commande = 12345;
            int commande2 = 123;
            var dao = new UtilisateurDAO();
            Historique hist = dao.getOneHistUtilisateur(login, commande);
            Historique histNull = dao.getOneHistUtilisateur(login, commande2);
            Assert.IsNotNull(hist);
            Assert.IsNull(histNull);
        }

        [TestMethod]
        public void TestAddHistorique()
        {
            String login = "admin";
            String boutique = "Antibes";
            String recette = "Recette2";
            int quantite = 11;
            String time = "2015-05-16T12:38:33.513+02:00";
            int commande = 11111;
            var dao = new UtilisateurDAO();
            dao.addHistToUtilisateur(login, commande,boutique,recette,quantite,time);
            Historique info = dao.getOneHistUtilisateur(login, commande);
            Assert.AreEqual(boutique, info.boutique);
            Assert.AreEqual(recette, info.recette);
            Assert.AreEqual(quantite, info.quantite);
            Assert.AreEqual(time, info.time);
        }

        [TestMethod]
        public void TestDeleteHistorique()
        {
            String login = "admin";
            int commande = 12345;
            var dao = new UtilisateurDAO();
            dao.deleteHistToUtilisateur(login, commande);
            Historique hist = dao.getOneHistUtilisateur(login, commande);
            Assert.IsNull(hist);
        }

        [TestMethod]
        public void TestUpdateHistorique()
        {
            String login = "admin";
            String boutique = "Antibes";
            String recette = "Recette2";
            int quantite = 11;
            String time = "2015-05-16T12:38:33.513+02:00";
            int commande = 12345;
            var dao = new UtilisateurDAO();
            dao.modifyHistToUtilisateur(login, commande, boutique, recette, quantite, time);
            Historique hist = dao.getOneHistUtilisateur(login, commande);
            Assert.AreEqual(boutique, hist.boutique);
            Assert.AreEqual(recette, hist.recette);
            Assert.AreEqual(quantite, hist.quantite);
            Assert.AreEqual(time, hist.time);
        }
    }
}
