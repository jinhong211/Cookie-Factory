<<<<<<< HEAD
//------------------------------------------------------------------------------
// <auto-generated>
//    此代码是根据模板生成的。
//
//    手动更改此文件可能会导致应用程序中发生异常行为。
//    如果重新生成代码，则将覆盖对此文件的手动更改。
// </auto-generated>
//------------------------------------------------------------------------------

namespace DAO
{
    using System;
    using System.Collections.Generic;
    
    public partial class Utilisateur
    {
        public Utilisateur()
        {
            this.Infomation = new HashSet<Infomation>();
            this.Historique = new HashSet<Historique>();
        }
    
        public int id { get; set; }
        public string login { get; set; }
        public string type { get; set; }
        public string passward { get; set; }
    
        public virtual ICollection<Infomation> Infomation { get; set; }
        public virtual ICollection<Historique> Historique { get; set; }
    }
}
=======
//------------------------------------------------------------------------------
// <auto-generated>
//    此代码是根据模板生成的。
//
//    手动更改此文件可能会导致应用程序中发生异常行为。
//    如果重新生成代码，则将覆盖对此文件的手动更改。
// </auto-generated>
//------------------------------------------------------------------------------

namespace DAO
{
    using System;
    using System.Collections.Generic;
    
    public partial class Utilisateur
    {
        public Utilisateur()
        {
            this.Infomation = new HashSet<Infomation>();
        }
    
        public int id { get; set; }
        public string login { get; set; }
        public string type { get; set; }
        public string passward { get; set; }
    
        public virtual ICollection<Infomation> Infomation { get; set; }
    }
}
>>>>>>> d3166097a1601c8264551dbd6c77969665be9206
