import React from 'react';
import logo from './logo.svg';
import { Counter } from './features/counter/Counter';
import './App.css';

export function App() {
  return (
    <div>
      <Header/>
   <BlogNavigation/>
   
   {/* <Navigation/> */}
   <Switch>
   <Route exact path='/'component = {Home}/>
   <Redirect from='/home'to = {'/'}/>
   <Route exact path='/course-register'component = {CourseRegister}/>
   <Route exact path ='/Login' component = {Login}/>
   <Route exact path='/online-profile'component = {OnlineProfile}/>
   <Route exact path='/school-staus'component = {SchoolStaus}/>
   <Route exact path='/join'component = {Join}/>
   <Route exact path='/header'component = {Header}/>
   <Route exact path='/basic'component = {Basic}/>
   </Switch>
   <HomePage/>
    </div>
  );
}
