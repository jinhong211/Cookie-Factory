using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestClient
{
    class Program
    {
        private void CoD(String role,String login,String passwd)
        {
            ServiceTCF.ServiceTCFClient userServiceStub = new
ServiceTCF.ServiceTCFClient();
            userServiceStub.ClientCredentials.UserName.UserName = login;
            userServiceStub.ClientCredentials.UserName.Password = passwd;
            Console.WriteLine("Welcome to CoD System, you logged as " + role);
            bool t = true;
            switch (role)
            {
                case "user":
                    {
                        while (t)
                        {
                            Console.WriteLine("1. add payment information.");
                            Console.WriteLine("2. get list of order information.");
                            Console.WriteLine("3. quit.");
                            String i = Console.ReadLine();
                            switch (i)
                            {
                                case "1":
                                    {
                                        String name;
                                        String surname;
                                        int num;
                                        String address;
                                        String date;
                                        int cry;
                                        Console.WriteLine("Name:");
                                        name = Console.ReadLine();
                                        Console.WriteLine("Surname:");
                                        surname = Console.ReadLine();
                                        Console.WriteLine("Carte number:");
                                        num = int.Parse(Console.ReadLine());
                                        Console.WriteLine("Address:");
                                        address = Console.ReadLine();
                                        Console.WriteLine("Expiration Date:");
                                        date = Console.ReadLine();
                                        Console.WriteLine("Cryptogramme:");
                                        cry = int.Parse(Console.ReadLine());
                                        Console.WriteLine(userServiceStub.addInfoAccount(name,surname,num,address,date,cry));
                                        break;
                                    }
                                case "2":
                                    {
                                        Console.WriteLine(userServiceStub.getListHistoriqueUser());
                                        break;
                                    }
                                case "3":
                                    {
                                        t = false;
                                        break;
                                    }
                                default: break;
                            }
                        }
                        break;
                    }
                case "admin":
                    {
                        while (t)
                        {
                            Console.WriteLine("1. get the list of all the order informations.");
                            Console.WriteLine("2. quit.");
                            String i = Console.ReadLine();
                            switch (i)
                            {
                                case "1":
                                    {
                                        Console.WriteLine(userServiceStub.getListHistorique());
                                        break;
                                    }
                                case "2":
                                    {
                                        t = false;
                                        break;
                                    }
                                default: break;
                            }
                        }
                        break;
                    }
                case "r1":
                    {
                        break;
                    }
                case "r2":
                    {
                        break;
                    }
                default:
                    {
                        break;
                    }
            }
        }
        static void Main(string[] args)
        {
            ServiceTCF.ServiceTCFClient userServiceStub = new
ServiceTCF.ServiceTCFClient();
            userServiceStub.ClientCredentials.UserName.UserName = "custom";
            userServiceStub.ClientCredentials.UserName.Password = "custom";
            bool t = true;
            String role = "custom";
            String login = "custom";
            String passwd = "custom";
            while (t)
            {
                Console.WriteLine("1. creat an account.");
                Console.WriteLine("2. login.");
                Console.WriteLine("3. enter CoD system.");
                Console.WriteLine("4. quit.");
                String i = Console.ReadLine();
                switch (i) {
                    case "1":
                        {
                            String newlogin;
                            String newpasswd;
                            String newtype;
                            Console.WriteLine("Login name:");
                            newlogin = Console.ReadLine();
                            Console.WriteLine("Password:");
                            newpasswd = Console.ReadLine();
                            Console.WriteLine("Type:");
                            newtype = Console.ReadLine();
                            Console.WriteLine(userServiceStub.createAccount(newlogin, newpasswd, newtype));
                            break;
                        }
                    case "2":
                        {
                            Console.WriteLine("Login name:");
                            login = Console.ReadLine();
                            Console.WriteLine("Password:");
                            passwd = Console.ReadLine();
                            Console.WriteLine(userServiceStub.loginAccount(login, passwd));
                            if (userServiceStub.loginAccount(login, passwd).Equals("User " + login + " login successfully"))
                            {
                                role = userServiceStub.getRoles(login);
                            }
                            break;
                        }
                    case "3":
                        {
                            new Program().CoD(role, login, passwd);
                            break;
                        }
                    case "4":
                        {
                            t = false;
                            break;
                        }
                    default: break;
                }
            }
            //Console.WriteLine(userServiceStub.addInfoAccount("Ding", "Feng", 1234567, "Valbonne", "11/17", 123));
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
