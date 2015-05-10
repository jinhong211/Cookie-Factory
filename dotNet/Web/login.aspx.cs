using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string userName = Request.Form["username"].ToString();
        string userPwd = Request.Form["userpwd"].ToString();
        if (userName != null && userPwd != null)
        {
            SqlConnection con = new SqlConnection("server=.;database=login;uid=sa;pwd=123;");//数据库连接字符串，需要修改成你的密码。如果出现访问数据库失败的提示就证明要么密码错误，要么数据库连接字符串有误（因为不同版本的Sql Server，数据库连接字符串写法不同，自行网上查到自己对应版本数据库的连接字符串）
            con.Open();
            SqlCommand cmd = new SqlCommand("select count(*) from login where username='" + userName + "'and userpwd='" + userPwd + "'", con);
            int count = Convert.ToInt32(cmd.ExecuteScalar());
            if (count > 0)
            {
                Response.Write("登陆成功");
            }
            else
            {
                Response.Write("登陆失败");
            }
        }
    }
}