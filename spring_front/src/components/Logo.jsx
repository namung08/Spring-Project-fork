<<<<<<< HEAD
import { Link } from "react-router-dom";
import LogoImage from '@components/img/logo/logo.png';


function Logo(){           // 로고
    return(
    <div className="logo"> 
     <Link to={'/'}><img src={LogoImage} alt="Logo" style={{marginLeft:'-25px',marginTop:'5px',}} width='130px' height='90px' />  </Link>
    </div> 
  ) ;
  }

=======
import { Link } from "react-router-dom";
import LogoImage from '@components/img/logo/logo.png';


function Logo(){           // 로고
    return(
    <div className="logo"> 
     <Link to={'/'}><img src={LogoImage} alt="Logo" style={{marginLeft:'-25px',marginTop:'5px',}} width='130px' height='90px' />  </Link>
    </div> 
  ) ;
  }

>>>>>>> beb6b40a0bec7b2e499fafc6b1ebed73cf8a6acd
  export default Logo;