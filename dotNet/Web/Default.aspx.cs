
using System;
using System.Collections;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Web;
using System.Web.SessionState;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.HtmlControls;
using System.Data.OleDb;


namespace lsj
{
　/// <summary>
　/// Summary description for WebForm1.
　/// </summary>
　public class WebForm1 : System.Web.UI.Page
　{
　　protected System.Web.UI.WebControls.Label Label1;
　　protected System.Web.UI.WebControls.Label Label2;
　　protected System.Web.UI.WebControls.TextBox Userid;
　　protected System.Web.UI.WebControls.Button LogButton;
　　protected System.Web.UI.WebControls.TextBox Pwd;
　　protected System.Web.UI.WebControls.Label Msg;
　　protected System.Web.UI.HtmlControls.HtmlForm Form1;　　
　　protected System.Web.UI.WebControls.RequiredFieldValidator rfvUserid;
　　protected System.Web.UI.WebControls.RequiredFieldValidator rfvPwd;
　　public string strConnection;
　　OleDbConnection myConn;

　　public WebForm1()
　　{
　　　Page.Init += new System.EventHandler(Page_Init);
　　}


  private void Page_Load(object sender, System.EventArgs e);
　　


　　private void Page_Init(object sender, EventArgs e)
　　{
InitializeComponent();
string strConnection="Provider=Microsoft.Jet.OLEDB.4.0;Data Source="+Server.MapPath(".")+"..user.mdb;";
//user.mdb放在与aspx文件同一目录下
myConn=new OleDbConnection(strConnection);
　　}


　　private void InitializeComponent()
　　{
this.LogButton.Click += new System.EventHandler(this.LogButton_Click);
this.Load += new System.EventHandler(this.Page_Load);
　　}

　　private void LogButton_Click(object sender, System.EventArgs e)
　　{
string userid,pwd;
userid=Userid.Text;
pwd=Pwd.Text;
string mySel="SELECT count(*) as iCount from user where UserID=userid ";

OleDbCommand myCmd1=new OleDbCommand(mySel,myConn);
myCmd1.Connection.Open();
OleDbDataReader Dr1;
Dr1=myCmd1.ExecuteReader();
Dr1.Read();
string Count=Dr1["iCount"].ToString();
Dr1.Close();
myCmd1.Connection.Close();
string DrPwd,DrRoles;
if(Count!="0")
{
　mySel="SELECT * from user where UserID=userid";
　OleDbCommand myCmd=new OleDbCommand(mySel,myConn);
　myCmd.Connection.Open();
　OleDbDataReader Dr;
　Dr=myCmd.ExecuteReader();
　Dr.Read();
　DrPwd=Dr["Password"].ToString();
　Dr.Close();
　if(DrPwd==pwd)
     Msg.Text = "登录sccess.";
　　else
  Msg.Text="登录密码错.";
}
else
　　Msg.Text="没有这个用户.";
　　}
　}
}