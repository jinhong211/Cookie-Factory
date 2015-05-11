using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using ServiceTCF;

public partial class _Default : System.Web.UI.Page
{
    //ServiceTCF.ServiceTCFClient proxy;
    protected void Page_Load(object sender, EventArgs e)
    {
 
      /*  if (!IsPostBack)
        {
            proxy = new ServiceTCF.ServiceTCFClient();

        }*/
    }
    protected void btnHello_Click(object sender, EventArgs e)
    {

        //判断输入是否为空

        //proxy = new ServiceTCF.ServiceTCFClient();
        if (IDinput.Text != "" && PWinput.Text != "")
        {

            //不为空，则在控件lblText中输出 "Hello + (输入的内容) + ！"

            //lblText.Text = proxy.ClientCredentials.UserName.UserName = IDinput.Text;
            //lblText.Text = proxy.ClientCredentials.UserName.Password = PWinput.Text;

            lblText.Text = "Hello " + IDinput.Text +PWinput.Text;
            string s_url;
            s_url = "login.aspx?name=" + lblText.Text;
            Response.Redirect(s_url); 
            //Server.Transfer("login.aspx", true);
        }

        else
        {

            //为空时，则在控件lblText中输出 "请重新输入！"

            lblText.Text = "请重新输入！";

        }

    }
}