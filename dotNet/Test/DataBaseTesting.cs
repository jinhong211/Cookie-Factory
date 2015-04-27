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
            var utilisateur = new UtilisateurDAO();
            List<Utilisateur> utilisateurList = utilisateur.getListUtilisateurs();

            Assert.IsNotNull(utilisateurList);
        }
    }
}
