package com.tool;

public class MyURL {

	//public static final String HIP = "http://10.26.230.144:8080/IntimateCarCare";
	public static final String HIP = "http://interman.ittun.com/IntimateCarCare";
	
	/**
	 * -------------------------请求错误的标志----------------------------------
	 */
	/**服务器错误0**/
	public static final int  MSG_OTHERS_ERROR=0;
	/**令牌错误1**/
	public static final int MSG_TOKENS_ERROR=1;
	/**已注册2**/
	public static final int MSG_YETERGISTER_ERROR=2;
	/**密码错误3**/
	public static final int MSG_PWD_ERROR=3;
	
	
	
	public static final String LOGIN = HIP+"/user/userLogin";//登陆请求
	public static final String REGISTER = HIP+"/user/register";//注册请求
	public static final String HOME = HIP+"/car/home";//首页数据获取请求（除商品列表推荐）
	public static final String HOMEGOODS = HIP+"/mall/getRecommendGoods";//获取商家推荐列表请求
	public static final String CARLIST = HIP+"/car/carList";//获取拥有车列表请求
	public static final String WEATHER = HIP+"/basic/getWeather";//获取天气详情
	public static final String MERCHANT = HIP+"/mall/gML";//获取商家列表
	public static final String GOODSDETAIL = HIP+"/mall/gGD";//获取商品详情
	public static final String GOODS = HIP+"/mall/gGL";//获取商品列表
	public static final String MERCHANTDETAIL = HIP+"/mall/gMD";//获取商家详情	
	public static final String MY = HIP+"/car/carInfo";//获取我的界面数据
	public static final String INSURANCERECORD = HIP+"/car/gIR";//获取保险界面数据
	public static final String ALLYEARINSPECT = HIP+"/car/gAIL";//获取年检列表
	public static final String ADDINSURANCERECORD = HIP+"/car/aIR";//添加保险界面数据
	public static final String CHANGEYEARINSPECT = HIP+"/car/rAI";//修改年检界面数据
	public static final String ADDYEARINSPECTION = HIP+"/car/aAI";//添加年检数据
	public static final String CHANGEINSURANCERECORD = HIP+"/car/rIR";//修改保险界面数据
	public static final String ALLPECCANCY= HIP+"/car/gWZ";//所有的违章的信息
	public static final String ALLBRANDS= HIP+"/car/gAB";//所有的汽车品牌
	public static final String CHANGEPASS = HIP+"/user/rI";//获取修改密码
	public static final String MYINFO = HIP+"/user/uFA";//获取我的界面数据
	public static final String CHANGEINFOR = HIP+"/user/rI";//获取我信息
	public static final String CARREPORT = HIP+"/car/getNowDeReport";//获取车辆检测报告
	public static final String HISTORYCARREPORTLIST = HIP+"/car/getDeReportList";//获取历史车辆检测报告列表
	public static final String HISTORYCARREPORTDETAIL = HIP+"/car/getDeReportDetail";//获取历史车辆检测报告详情
	public static final String FAULTDETAIL = HIP+"/car/getFaultDetail";//获取故障码解释
	public static final String DATAFLOWDETAIL = HIP+"/car/getDFDetail";//获取数据流解释
	public static final String CONSULTLIST = HIP+"/basic/getProblem";//咨询列表请求
	public static final String CONSULTDETAIL= HIP+"/basic/problemDetail";//咨询详情请求
	public static final String REMIND= HIP+"/car/getRemindByLevel";//获取提醒
	public static final String REMINDNUM= HIP+"/car/getRemindNumByLevel";//获取各等级未读数量
	public static final String CHANGECAR= HIP+"/car/changeDefaultCarH";//更改车辆
	public static final String MAINTENANCE= HIP+"/car/gMR";//保养列表
	public static final String TOURREPORTLIST= HIP+"/car/getTRBriefByUserId";//行程报告列表请求
	public static final String TOURREPORTDETAIL= HIP+"/car/getTRDetailByTid";//行程报告详情请求
	public static final String REDINFO= HIP+"/red/getCarRedByUserId";//红包现状请求
	public static final String REDLIST= HIP+"/red/getRRListByUserId";//获取红包列表
	public static final String ALLARCTIC= HIP+"/car/gAA";//获取全部车型的
	public static final String BUYRECORD= HIP+"/car/gCB";//获取购买档案
	public static final String CHANGERECORD= HIP+"/car/rCB";//修改购买档案
	public static final String ADDARCTIC= HIP+"/car/aC";//添加新车
	public static final String CARSETTINGDATA= HIP+"/car/getCarBInfoByUserId";//获取车辆设置数据
	public static final String CARSETTINGCHANGECAR= HIP+"/car/changeDefaultCarC";//车辆设置界面 切换车
	public static final String ADDMAINTENANCE = HIP+"/car/aMTR";//添加保养记录
	public static final String CHANGEMAINTENANCE = HIP+"/car/rMTR";//修改保养记录
	public static final String DELETECAR = HIP+"/car/dC";//删除车辆
	public static final String CHANGECARBASE = HIP+"/car/rCBI";//修改车辆基本信息
	public static final String CHANGENUM = HIP+"/car/rCN";//修改车牌号
	public static final String UPLOADCARPIC = HIP+"/car/uploadCarPic";//上传车照片
	public static final String UPLOADUSERPIC = HIP+"/user/uploadHeadPic";//头像上传
	public static final String EXIT = HIP+"/user/userExit";//退出登录
	
	
}
