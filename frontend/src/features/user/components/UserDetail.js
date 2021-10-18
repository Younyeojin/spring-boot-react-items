import React, { useState } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import {
  decrement,
  increment,
  incrementByAmount,
  incrementAsync,
  incrementIfOdd,
  selectCount,
} from './userSlice';
import styles from './User.module.css';

export function User() {
  const count = useSelector(selectCount);
  const dispatch = useDispatch();
  const [incrementAmount, setIncrementAmount] = useState('2');

  const incrementValue = Number(incrementAmount) || 0;

  return (
    <div>
        <figure>
        <img src={logo}/>
        <figcaption>오늘은 남은 인생이 시작되는 첫째날</figcaption>
        </figure>
    <h1>Jenny</h1>
    <p>이메일 : XXX@naver.com</p>
    <h2>Who I am?</h2>
    <p>웹 개발 경력 없어요</p>
    <h2>GitHub</h2>
    <ul>
        <h1>GitHub</h1>
    </ul>
    <hr></hr>
    <h2>Skills</h2>
    <ul>
        <li>사용 해본 언어
            <ul>
                <li><mark>HTML</mark></li>
                <li>JAVA</li>
                <li>Python</li>
            </ul>
        </li>
        <li>사용 툴
            <ul>
                <li>IntelliJ</li>
                <li>Spring Frameworkd</li>
                <li>PyCharm</li>
                <li>Docker</li>
                <li><b>Visual Studio</b></li>
            </ul>
        </li>
    </ul>
    <h2>Academic</h2>
    <table>
        <caption>학력 사항</caption>
        <thead>
            <tr>
                <th>출신학교</th>
                <th>전공</th>
                <th>기간</th>
                <th>졸업구분</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>고등학교</th>
                <td>해당없음</td>
                <td>2011.03~2014.02</td>
                <td>졸업</td>
            </tr>
            <tr>
                <th>대학교</th>
                <td>호텔관광경영학과</td>
                <td>2014.03~2019.02</td>
                <td>졸업</td>
            </tr>
        </tbody>
    </table>
    </div>
  );
}
