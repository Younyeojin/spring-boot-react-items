import React from 'react';
import {Link} from 'react-router-dom'

export const Navigation() {return (
    <nav>
    <ol>
    <li><Link to="/home">Home</Link></li>
    <li><Link to="/course-register">과목 등록2</Link></li>
    <li><Link to="/Login">로그인</Link></li>
    <li><Link to="/online-profile">프로필</Link></li>
    <li><Link to="/scool-staus">학교 현황</Link></li>
    <li><Link to="/join">회원가입</Link></li>
    </ol>
</nav>)
    
}
