using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfServiceTCF
{
    
    [ServiceContract]
    public interface IServiceTCF
    {
        [OperationContract]
        String createAccount(String login, String passward, String type);
        [OperationContract]
        String deleteAccount(String login);
        [OperationContract]
        String updateAccount(String passward,String type);
        [OperationContract]
        String loginAccount(String login, String passward);
        [OperationContract]
        String getListAccount();
        [OperationContract]
        String getListInfoAccount();
        [OperationContract]
        String addInfoAccount(String nom, String prenom, int numero, String address, String exp, int cry);
        [OperationContract]
        String deleteInfoAccount(int numero);
        [OperationContract]
        String updateInfoAccount(int numero, String address);
        [OperationContract]
        String getInfoAccount(int numero);
    }
}
