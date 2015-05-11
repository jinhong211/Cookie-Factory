using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.IdentityModel.Selectors;

namespace WcfServiceTCF
{
    public class CustomUserNameValidator : UserNamePasswordValidator
    {
        public override void Validate(string userName, string password)
        {
            if (userName == null || password == null)
            {
                throw new ArgumentNullException();
            }
            if (!new ServiceTCF().loginAccount(userName, password).Equals("User " + userName + " login successfully"))
            {
                throw new Exception("Utilisateur ou Mot de passe incorrect");
            }
        }
    }
}