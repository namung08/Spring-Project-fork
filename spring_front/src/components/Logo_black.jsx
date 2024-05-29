<<<<<<< HEAD
import { Link } from "react-router-dom";
import LogoImage from '@components/img/logo/logo_black.png';


function Logo(){           // 로고
    return(
    <div className="logo"> 
     <Link to={'/'}><img src={LogoImage} alt="Logo" style={{marginLeft:'0px',marginTop:'5px',}} width='200px' height='160px' />  </Link>
    </div> 
  ) ;
  }

=======
import { Link } from "react-router-dom";
import LogoImage from '@components/img/logo/logo_black.png';


function Logo(){           // 로고
    return(
    <div className="logo"> 
     <Link to={'/'}><img src={LogoImage} alt="Logo" style={{marginLeft:'0px',marginTop:'5px',}} width='200px' height='160px' />  </Link>
    </div> 
  ) ;
  }

>>>>>>> beb6b40a0bec7b2e499fafc6b1ebed73cf8a6acd
  export default Logo;