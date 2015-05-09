using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Security;

namespace WcfServiceTCF
{
    public class CustomRoleProvider : RoleProvider
    {
        public override string ApplicationName
        {
            get;
            set;
        }
        public override String[] GetRolesForUser(String username)
        {
            return new String[] { new ServiceTCF().getRoles(username) };
        }
        public override bool IsUserInRole(String username, String roleName)
        {
            return GetRolesForUser(username).Contains(roleName);
        }
        public override void AddUsersToRoles(String[] usernames, String[]
     roleNames)
        {
            throw new Exception("Unable to perform this action");
        }
        public override void CreateRole(String roleName)
        {
            throw new Exception("Unable to perform this action");
        }
        public override bool DeleteRole(String roleName, bool throwOnPopulatedRole)
        {
            throw new Exception("Unable to perform this action");
        }
        public override String[] FindUsersInRole(String roleName, String
        usernameToMatch)
        {
            throw new Exception("Unable to perform this action");
        }
        public override String[] GetAllRoles()
        {
            throw new Exception("Unable to perform this action");
        }
        public override String[] GetUsersInRole(String roleName)
        {
            throw new Exception("Unable to perform this action");
        }
        public override void RemoveUsersFromRoles(String[] usernames, String[]
        roleNames)
        {
            throw new Exception("Unable to perform this action");
        }
        public override bool RoleExists(String roleName)
        {
            throw new Exception("Unable to perform this action");
        }
    }
}