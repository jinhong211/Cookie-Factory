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
        String updateAccount(String login,String passward,String type);
        [OperationContract]
        String loginAccount(String login, String passward);
        [OperationContract]
        String getListAccount();
        [OperationContract]
        String getListInfoAccount();
        [OperationContract]
        String addInfoAccount();
        [OperationContract]
        String deleteInfoAccount();
        [OperationContract]
        String updateInfoAccount();
        [OperationContract]
        String getInfoAccount();
    }
}
