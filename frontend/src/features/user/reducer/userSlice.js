import { createAsyncThunk, createSlice } from '@reduxjs/toolkit';
import { userAPI } from 'features/user';

const userJoinPage = async(x) => {
  const res = await userAPI.userJoin(x)
  return res.data
}
const userFetchOnePage = async(x) => {
  const res = await userAPI.userFetchOne(x)
  return res.data
}
const userFetchListPage = async() => {
  const res = await userAPI.userFetchList()
}
const userLoginPage = async(x) => {
  const res = await userAPI.userLogin(x)
  return res.data
}
const userModifyPage = async(x) => {
  const res = await userAPI.userModify(x)
  return res.data
}
const userRemovePage = async(x) => {
  const res = await userAPI.userRemove(x)
  return res.data
}

export const joinPage = createAsyncThunk('users/join', userJoinPage)
export const FetchOnePage = createAsyncThunk('users/one', userFetchOnePage)
export const FetchListPage = createAsyncThunk('users/list', userFetchListPage)
export const LoginPage = createAsyncThunk('users/login', userLoginPage)
export const ModifyPage = createAsyncThunk('users/modify', userModifyPage)
export const RemovePage = createAsyncThunk('users/remove', userRemovePage)

export default userSlice.reducer;