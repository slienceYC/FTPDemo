package com.dhht.ftp.util;

import java.util.Random;

public class NameUtil {

    /**
     * 姓氏
     */
    public static   String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋",
            "沈", "韩", "杨", "朱", "秦", "尤", "许", "何", "吕", "施",
            "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚",
            "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘",
            "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤",
            "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐", "费",
            "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕",
            "郝", "邬", "安", "常", "乐", "于", "时", "傅", "皮", "卞", "齐",
            "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆",
            "萧", "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄", "米", "贝",
            "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪",
            "舒", "屈", "项", "祝", "董", "梁", "杜", "阮", "蓝", "闵", "席", "季",
            "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭", "梅", "盛",
            "林", "刁", "钟", "徐", "邱", "骆", "高", "夏", "蔡", "田", "樊", "胡",
            "凌", "霍", "虞", "万", "支", "柯", "昝", "管", "卢", "莫", "经", "房",
            "裘", "缪", "干", "解", "应", "宗", "丁", "宣", "贲", "邓", "郁", "单",
            "杭", "洪", "包", "诸", "左", "石", "崔", "吉", "钮", "龚", "程", "嵇",
            "邢", "滑", "裴", "陆", "荣", "翁", "荀", "羊", "于", "惠", "甄", "曲",
            "家", "封", "芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段",
            "富", "巫", "乌", "焦", "巴", "弓", "牧", "隗", "山", "谷", "车", "侯",
            "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宫", "宁", "仇",
            "栾", "暴", "甘", "钭", "厉", "戎", "祖", "武", "符", "刘", "景", "詹",
            "束", "龙", "叶", "幸", "司", "韶", "郜", "黎", "蓟", "溥", "印", "宿", "白",
            "怀", "蒲", "邰", "从", "鄂", "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池",
            "乔", "阴", "郁", "胥", "能", "苍", "双", "闻", "莘", "党", "翟", "谭", "贡", "劳",
            "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦", "雍", "却", "璩", "桑", "桂", "濮",
            "牛", "寿", "通", "边", "扈", "燕", "冀", "浦", "尚", "农", "温", "别", "庄", "晏",
            "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦", "艾", "鱼", "容", "向", "古",
            "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘",
            "匡", "国", "文", "寇", "广", "禄", "阙", "东", "欧", "殳", "沃", "利", "蔚", "越",
            "夔", "隆", "师", "巩", "厍", "聂", "晁", "勾", "敖", "融", "冷", "訾", "辛", "阚",
            "那", "简", "饶", "空", "曾", "毋", "沙", "乜", "养", "鞠", "须", "丰", "巢", "关",
            "蒯", "相", "查", "后", "荆", "红", "游", "郏", "竺", "权", "逯", "盖", "益", "桓",
            "公", "仉", "督", "岳", "帅", "缑", "亢", "况", "郈", "有", "琴", "归", "海", "晋",
            "楚", "闫", "法", "汝", "鄢", "涂", "钦", "商", "牟", "佘", "佴", "伯", "赏", "墨",
            "哈", "谯", "篁", "年", "爱", "阳", "佟", "言", "福", "南", "火", "铁", "迟", "漆",
            "官", "冼", "真", "展", "繁", "檀", "祭", "密", "敬", "揭", "舜", "楼", "疏", "冒", "浑",
            "挚", "胶", "随", "高", "皋", "原", "种", "练", "弥", "仓", "眭", "蹇", "覃", "阿", "门", "恽", "" +
            "来", "綦", "召", "仪", "风", "介", "巨", "木", "京", "狐", "郇", "虎", "枚", "抗", "达", "杞", "苌",
            "折", "麦", "庆", "过", "竹", "端", "鲜", "皇", "亓", "老", "是", "秘", "畅", "邝", "还", "宾", "闾", "辜",
            "纵", "侴", "万俟", "司马", "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "赫连", "皇甫", "羊舌", "尉迟",
            "公羊", "澹台", "公冶", "宗正", "濮阳", "淳于", "单于", "太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐",
            "钟离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空", "兀官", "司寇", "南门", "呼延", "子车", "颛孙",
            "端木", "巫马", "公西", "漆雕", "车正", "壤驷", "公良", "拓跋", "夹谷", "宰父", "谷梁", "段干", "百里", "东郭",
            "微生", "梁丘", "左丘", "东门", "西门", "南宫", "第五", "公仪", "公乘", "太史", "仲长", "叔孙", "屈突", "尔朱", "东乡",
            "相里", "胡母", "司城", "张廖", "雍门", "毋丘", "贺兰", "綦毋", "屋庐", "独孤", "南郭", "北宫", "王孙"};

    public static String[] companyPix = new String[]{"有限公司","责任有限公司","股份有限公司","集团","合作社","合作集团","股份责任有限公司","有限责任集团"};

    public static String[] companyFunction = new String[]{"科技","教育","餐饮","服务","金融","广告","策划","投资","电子","数码","旅游","家居","珠宝",
            "建材","美妆","服装","环保","网络","物流","医疗","器材","汽修","农具","智能","酒业","通讯","软件","烟草","乳业","化工","信息技术",
    "矿业","木业"};

    public static String[] makeDepartmentPix = new String[]{"刻章","刻章社","图文","电脑印章","印章定制","刻制社","刻制服务部","图文设计所","彩印店","制章有限公司",
    "刻字社","文字商行","印章经营部","刻章工作室","图文工作室","彩印工作室","彩印有限公司","彩印图文店","刻章彩印经营部","雕刻社","企业管理服务部",
    "图文设计工作室","刻章合作社","彩印合作社","文字工作室"};

    public static String chinese  = "\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765\u4ed6\u8fd9\u4e0a\u7740\u4e2a\u5730\u5230\u5927\u91cc\u8bf4\u5c31\u53bb\u5b50\u5f97\u4e5f\u548c\u90a3\u8981\u4e0b\u770b\u5929\u65f6\u8fc7\u51fa\u5c0f\u4e48\u8d77\u4f60\u90fd\u628a\u597d\u8fd8\u591a\u6ca1\u4e3a\u53c8\u53ef\u5bb6\u5b66\u53ea\u4ee5\u4e3b\u4f1a\u6837\u5e74\u60f3\u751f\u540c\u8001\u4e2d\u5341\u4ece\u81ea\u9762\u524d\u5934\u9053\u5b83\u540e\u7136\u8d70\u5f88\u50cf\u89c1\u4e24\u7528\u5979\u56fd\u52a8\u8fdb\u6210\u56de\u4ec0\u8fb9\u4f5c\u5bf9\u5f00\u800c\u5df1\u4e9b\u73b0\u5c71\u6c11\u5019\u7ecf\u53d1\u5de5\u5411\u4e8b\u547d\u7ed9\u957f\u6c34\u51e0\u4e49\u4e09\u58f0\u4e8e\u9ad8\u624b\u77e5\u7406\u773c\u5fd7\u70b9\u5fc3\u6218\u4e8c\u95ee\u4f46\u8eab\u65b9\u5b9e\u5403\u505a\u53eb\u5f53\u4f4f\u542c\u9769\u6253\u5462\u771f\u5168\u624d\u56db\u5df2\u6240\u654c\u4e4b\u6700\u5149\u4ea7\u60c5\u8def\u5206\u603b\u6761\u767d\u8bdd\u4e1c\u5e2d\u6b21\u4eb2\u5982\u88ab\u82b1\u53e3\u653e\u513f\u5e38\u6c14\u4e94\u7b2c\u4f7f\u5199\u519b\u5427\u6587\u8fd0\u518d\u679c\u600e\u5b9a\u8bb8\u5feb\u660e\u884c\u56e0\u522b\u98de\u5916\u6811\u7269\u6d3b\u90e8\u95e8\u65e0\u5f80\u8239\u671b\u65b0\u5e26\u961f\u5148\u529b\u5b8c\u5374\u7ad9\u4ee3\u5458\u673a\u66f4\u4e5d\u60a8\u6bcf\u98ce\u7ea7\u8ddf\u7b11\u554a\u5b69\u4e07\u5c11\u76f4\u610f\u591c\u6bd4\u9636\u8fde\u8f66\u91cd\u4fbf\u6597\u9a6c\u54ea\u5316\u592a\u6307\u53d8\u793e\u4f3c\u58eb\u8005\u5e72\u77f3\u6ee1\u65e5\u51b3\u767e\u539f\u62ff\u7fa4\u7a76\u5404\u516d\u672c\u601d\u89e3\u7acb\u6cb3\u6751\u516b\u96be\u65e9\u8bba\u5417\u6839\u5171\u8ba9\u76f8\u7814\u4eca\u5176\u4e66\u5750\u63a5\u5e94\u5173\u4fe1\u89c9\u6b65\u53cd\u5904\u8bb0\u5c06\u5343\u627e\u4e89\u9886\u6216\u5e08\u7ed3\u5757\u8dd1\u8c01\u8349\u8d8a\u5b57\u52a0\u811a\u7d27\u7231\u7b49\u4e60\u9635\u6015\u6708\u9752\u534a\u706b\u6cd5\u9898\u5efa\u8d76\u4f4d\u5531\u6d77\u4e03\u5973\u4efb\u4ef6\u611f\u51c6\u5f20\u56e2\u5c4b\u79bb\u8272\u8138\u7247\u79d1\u5012\u775b\u5229\u4e16\u521a\u4e14\u7531\u9001\u5207\u661f\u5bfc\u665a\u8868\u591f\u6574\u8ba4\u54cd\u96ea\u6d41\u672a\u573a\u8be5\u5e76\u5e95\u6df1\u523b\u5e73\u4f1f\u5fd9\u63d0\u786e\u8fd1\u4eae\u8f7b\u8bb2\u519c\u53e4\u9ed1\u544a\u754c\u62c9\u540d\u5440\u571f\u6e05\u9633\u7167\u529e\u53f2\u6539\u5386\u8f6c\u753b\u9020\u5634\u6b64\u6cbb\u5317\u5fc5\u670d\u96e8\u7a7f\u5185\u8bc6\u9a8c\u4f20\u4e1a\u83dc\u722c\u7761\u5174\u5f62\u91cf\u54b1\u89c2\u82e6\u4f53\u4f17\u901a\u51b2\u5408\u7834\u53cb\u5ea6\u672f\u996d\u516c\u65c1\u623f\u6781\u5357\u67aa\u8bfb\u6c99\u5c81\u7ebf\u91ce\u575a\u7a7a\u6536\u7b97\u81f3\u653f\u57ce\u52b3\u843d\u94b1\u7279\u56f4\u5f1f\u80dc\u6559\u70ed\u5c55\u5305\u6b4c\u7c7b\u6e10\u5f3a\u6570\u4e61\u547c\u6027\u97f3\u7b54\u54e5\u9645\u65e7\u795e\u5ea7\u7ae0\u5e2e\u5566\u53d7\u7cfb\u4ee4\u8df3\u975e\u4f55\u725b\u53d6\u5165\u5cb8\u6562\u6389\u5ffd\u79cd\u88c5\u9876\u6025\u6797\u505c\u606f\u53e5\u533a\u8863\u822c\u62a5\u53f6\u538b\u6162\u53d4\u80cc\u7ec6";

    /**
     * 姓名生成
     * @return
     */
    public static String GeneratePersonName() {
        Random random = new Random(System.currentTimeMillis());        /* 598 百家姓 */
        int index = random.nextInt(Surname.length - 1);
        String name = Surname[index]; //获得一个随机的姓氏				/* 从常用字中选取一个或两个字作为名 */
        if (random.nextBoolean()) {
            name += getChinese() + getChinese();
        } else {
            name += getChinese();
        }
        return name;
    }

    public static String[] GenerateUseDepartmentNameAndFunction(){
        Random random = new Random();
        int pix = random.nextInt(companyPix.length-1);
        int fun = random.nextInt(companyFunction.length-1);
        int isFun = random.nextInt(4);
        int length = random.nextInt(6)+2;
        String function = companyFunction[fun];
        String temp = "";
        String name = "";
        if(isFun>1){
            for(int i=0;i<length;i++){
                temp = temp + getChinese();
            }
            name = temp + function+companyPix[pix];
        }else {
            for(int i=0;i<length;i++){
                temp = temp + getChinese();
            }
            name = temp +companyPix[pix];
        }
        return new String[]{name,function};
    }


    /**
     * 制作单位名字生成
     * @return
     */
    public static String GenerateMakeDepartmentName(){
        Random random = new Random();
        int pix = random.nextInt(makeDepartmentPix.length - 1);
        int length = random.nextInt(7)+2;
        String temp = "";
        for(int i = 0;i<length;i++){
            temp = temp+getChinese();
        }
        String name = temp + makeDepartmentPix[pix];
        return name;
    }

    /**
     * 生成汉字
     * @return
     */
    public static String getChinese() {
        String  str = "";
//        int highCode;
//        int lowCode;
//
//        Random random = new Random();
//
//        highCode = (176 + Math.abs(random.nextInt(39))); //B0 + 0~39(16~55) 一级汉字所占区
//        lowCode = (161 + Math.abs(random.nextInt(93))); //A1 + 0~93 每区有94个汉字
//
//        byte[] b = new byte[2];
//        b[0] = (Integer.valueOf(highCode)).byteValue();
//        b[1] = (Integer.valueOf(lowCode)).byteValue();
//
//        try {
//            str = new String(b, "GBK");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        str = chinese.charAt(new Random().nextInt(chinese.length()-1)) + "";
        return str;
    }

    /**
     * 生成性别
     * @return
     */
    public static String gender(){
        Random random = new Random();
        int i = random.nextInt(4);
        if(i>1){
            return "男";
        }else {
            return "女";
        }
    }

    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            //System.out.println(GenerateUseDepartmentName());
        }
    }
}

