using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestClient
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceTCF.ServiceTCFClient userServiceStub = new
ServiceTCF.ServiceTCFClient();
            userServiceStub.ClientCredentials.UserName.UserName = "dingding";
            userServiceStub.ClientCredentials.UserName.Password = "dd123";
            //userServiceStub.createAccount("dingding", "dd123", "user");
            Console.WriteLine(userServiceStub.addInfoAccount("Ding", "Feng", 1234567, "Valbonne", "11/17", 123));
            /*Console.WriteLine(userServiceStub.getListAccount());
            Console.WriteLine(userServiceStub.createAccount("dingding","dd123","USER"));
            Console.WriteLine(userServiceStub.createAccount("dingding", "dd123", "USER"));
            Console.WriteLine(userServiceStub.createAccount("smallbirdking", "sbk123", "USER"));
            Console.WriteLine(userServiceStub.deleteAccount("smallbirdking"));
            Console.WriteLine(userServiceStub.deleteAccount("jinhong"));
            Console.WriteLine(userServiceStub.updateAccount("jinhong","12345","ADMIN"));
            Console.WriteLine(userServiceStub.updateAccount("dingding","dd1111","ADMIN"));
            Console.WriteLine(userServiceStub.getListAccount());
            Console.WriteLine(userServiceStub.loginAccount("dingding","dd123"));
            Console.WriteLine(userServiceStub.loginAccount("dingding","dd1111"));
            Console.WriteLine(userServiceStub.loginAccount("smallbirdking","sbk123"));
            Console.WriteLine(userServiceStub.getListInfoAccount("dingding"));
            Console.WriteLine(userServiceStub.getListInfoAccount("smallbirdking"));
            Console.WriteLine(userServiceStub.addInfoAccount("dingding", "Ding", "Feng", 1234567, "Valbonne", "11/17", 123));
            Console.WriteLine(userServiceStub.addInfoAccount("dingding", "Ding", "Feng", 1234567, "Valbonne", "11/17", 123));
            Console.WriteLine(userServiceStub.addInfoAccount("dingding", "Ding", "Feng", 1111111, "Valbonne", "11/17", 123));
            Console.WriteLine(userServiceStub.addInfoAccount("smallbirdking", "Wang", "Yuqi", 1234567, "Valbonne", "11/17", 123));
            Console.WriteLine(userServiceStub.getInfoAccount("dingding",1111111));
            Console.WriteLine(userServiceStub.getInfoAccount("dingding",1123212));
            Console.WriteLine(userServiceStub.getInfoAccount("smallbirdking",1111111));
            Console.WriteLine(userServiceStub.getListInfoAccount("dingding"));
            Console.WriteLine(userServiceStub.deleteInfoAccount("dingding",1111111));
            Console.WriteLine(userServiceStub.deleteInfoAccount("dingding",1111111));
            Console.WriteLine(userServiceStub.deleteInfoAccount("smallbirdking",1111111));
            Console.WriteLine(userServiceStub.updateInfoAccount("dingding",1234567,"Antibes"));
            Console.WriteLine(userServiceStub.updateInfoAccount("dingding",1111111,"Antibes"));
            Console.WriteLine(userServiceStub.updateInfoAccount("smallbirdking",1111111,"Antibes"));
            Console.WriteLine(userServiceStub.getListInfoAccount("dingding"));*/
            Console.ReadLine();
        }
    }
}
