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
            ServiceReference1.ServiceTCFClient userServiceStub = new
ServiceReference1.ServiceTCFClient();
            Console.WriteLine(userServiceStub.createAccount("dingding","dd123","USER"));
            Console.WriteLine(userServiceStub.createAccount("smallbirdking", "sbk123", "USER"));
            Console.ReadLine();
        }
    }
}
