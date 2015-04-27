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
    }
}
