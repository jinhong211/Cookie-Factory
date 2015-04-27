using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using DAO;
using System.Transactions;

namespace Test
{
    [TestClass]
    public class DbTestBase
    {
        private TransactionScope scope;   
        [TestInitialize]
        public void SetUp()
        {
            this.scope = new TransactionScope();
        }
       
        [TestCleanup]
        public void TearDown()
        {
            this.scope.Dispose();
        }
    }
}
