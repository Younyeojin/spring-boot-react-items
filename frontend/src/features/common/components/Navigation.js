import React from 'react';
import {Link} from 'react-router-dom'

export default function Navigation() {
    return(
    <nav>
    <ol>
    <li><Link to="/home">Home</Link></li>
    <li><Link to="/userAdd">userAdd</Link></li>
    <li><Link to="/userLogin">userLogin</Link></li>
    <li><Link to="/userDetail">userDetail</Link></li>
    <li><Link to="/userList">userList</Link></li>
    <li><Link to="/userLogin">userLogin</Link></li>
    <li><Link to="/userModify">userModify</Link></li>
    <li><Link to="/userRemove">userRemove</Link></li>
    </ol>
</nav>);
    
}
