Page({
  data: {
    phone: '',
    password: '',
    success: false,
    text: ''
 
  },
 
  // 获取输入账号 
  phoneInput: function (e) {
    this.setData({
      phone: e.detail.value
    })
  },
 
  // 获取输入密码 
  passwordInput: function (e) {
    this.setData({
      password: e.detail.value
    })
  },
 
  // 登录 
  login: function () {
    var that = this;   
 
    var warn = null; //warn为当手机号为空或格式不正确时提示用户的文字，默认为空
    if (that.data.phone.length == 0) {
      wx.showToast({
        title: '用户名不能为空',
        icon: 'loading',
        duration: 1000
      })
    } else if (that.data.password.length == 0) {
      wx.showToast({
        title: '密码不能为空',
        icon: 'loading',
        duration: 1000
      })
    }else {
      
      wx.request({
        url: 'http://localhost:8080/wx/login',
        method: "POST",
        data: {
          phone: that.data.phone,
          password: that.data.password
        },
        header: {
          'content-type': 'application/x-www-form-urlencoded'
        },
        success: function (res) {
          console.log(res);
          if (!res.data.success) {  //判断是否能正常登录
            warn = "请检查账号密码是否正确！";
            wx.showModal({
              title: '提示',
              content: warn
            })
            return;
          } else {
            wx.setStorageSync("user",res.data.data)
            wx.navigateTo({
              url: '/pages/exercise_list/index',
            })
          }
        }
 
      })
 
 
 
    }
  },
  // 注册 
  register: function () {
    wx.navigateTo({
      url: '/pages/register/register',
    })
  }
 
})