// pages/exercise_list/index.js
import { request } from "../../request/index.js";

Page({

  /**
   * 页面的初始数据
   */
  data: {
    tabs: [],
    id:""
  },
  
  
  onLoad: function(options){
    this.getSectionList();
    this.getCourseSection();
  },
  // 标题点击事件 从子组件传递过来
  handleTabsItemChange(e){
    // 1 获取被点击的标题索引
    const {index}=e.detail;
    // 2 修改源数组
    let {tabs}=this.data;
    tabs.forEach((v,i)=>i===index?v.isActive=true:v.isActive=false);
    // 3 赋值到data中
    this.setData({
      tabs
    })
  },
  getSectionList(){
    request({
      url:"/section/list"
    })
    .then(res =>{
      res.data.forEach(item =>{
        item.isActive = false;
      })
      res.data[0].isActive="true";
      this.setData({
        tabs:res.data
      })
      
      var that=this;
      for(var i=0;i<res.data.length;i++){
        if(res.data[i].isActive==="true"){
          console.log("成功")
          console.log(res.data[i].sectionId)
          // this.data.QueryParams.id=res.data[i].sectionId
          that.setData({
            id:res.data[i].sectionId
          })
          
        }else{
          console.log("失败")
          console.log(res.data[i].sectionId)
        }
      }
      console.log(res)
    })
  
  },
  async getCourseSection(){
    const res = await request({url:"/cs/getCourseSectionById",data:{id:this.data.id}})
    console.log(res)
   }
  
})