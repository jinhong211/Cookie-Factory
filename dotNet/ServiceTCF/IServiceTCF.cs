using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace ServiceTCF
{

    [ServiceContract]
    public interface IServiceTCF
    {
        [OperationContract]
        String createAccount(String login, String passward, String type);
        [OperationContract]
        String deleteAccount(String login);
        [OperationContract]
        String updateAccount(String login,String passward, String type);
        [OperationContract]
        String loginAccount(String login, String passward);
        [OperationContract]
        String getListAccount();
        [OperationContract]
        String getListInfoAccount(String login);
        [OperationContract]
        String addInfoAccount(String login,String nom, String prenom, int numero, String address, String exp, int cry);
        [OperationContract]
        String deleteInfoAccount(String login,int numero);
        [OperationContract]
        String updateInfoAccount(String login,int numero, String address);
        [OperationContract]
        String getInfoAccount(String login,int numero);
        [OperationContract]
        String getRoles(String username);
        [OperationContract]
        int getID(String username);
        [OperationContract]
        String getListHistorique();
        [OperationContract]
        String getListHistoriqueUser(String login);
        [OperationContract]
        String addHistAccount(String login, int commande, String boutique, String recette, int quantite, String time);
        [OperationContract]
        String payment(String role, String login, int number, int cry, double prix);
    }
}

