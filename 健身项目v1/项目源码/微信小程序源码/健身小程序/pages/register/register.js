Page({
 
  /**
   * 页面的初始数据
   */
  data: {
    phone: '', //获取到的手机栏中的值
    NewChanges: '',
    NewChangesAgain: '',
    success: false,
    state: ''
  },

  return_home: function (e) {
    wx.navigateTo({
      url: '/pages/logins/logins',
    })
 
  },
  handleInputPhone: function (e) {
    this.setData({
      phone: e.detail.value
    })
  },
  handleNewChanges: function (e) {
    this.setData({
      NewChanges: e.detail.value
    })
  },
  handleNewChangesAgain: function (e) {
    this.setData({
      NewChangesAgain: e.detail.value
    })
 
  },
  submit: function (e) {
    var that = this
    var warn = null; //warn为当手机号为空或格式不正确时提示用户的文字，默认为空
    if (this.data.phone == '') {
      wx.showToast({
        title: '号码不能为空',
        icon: 'loading',
        duration: 1000
      })
      return
    } 
    if (this.data.phone.trim().length != 11 || !/^1[3|4|5|6|7|8|9]\d{9}$/.test(this.data.phone)) {
      wx.showToast({
        title: '手机号格式错误',
        icon: 'loading',
        duration: 1000
      })
      return
    }else if (this.data.NewChanges == '') {
      wx.showToast({
        title: '请输入密码',
        icon: 'loading',
        duration: 1000
      })
      return
    } else if (this.data.NewChangesAgain != this.data.NewChanges) {
      wx.showToast({
        title: '两次密码不一致',
        icon: 'loading',
        duration: 1000
      })
      return
    } else {
      var that = this
      wx.request({
        url: 'http://localhost:8080/wx/register',
        method: "POST",
        data: {
          phone: that.data.phone,
          password: that.data.NewChanges
        },
        header: {
          "content-type": "application/x-www-form-urlencoded"
        },
        success: function (res) {
          wx.showToast({
            title: '提交成功~',
            icon: 'loading',
            duration: 2000
          })
          console.log(res)
          that.setData({
            success: true
          })
        }
      })
    }
  },
  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
 
  }
})