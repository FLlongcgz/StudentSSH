SSH框架基本操作步骤
=======
## 1、安装Spring Tool Suite插件（idea不需要）
## 2、加入Spring
### 1）加入jar包
### 2）配置web.xml
### 3）加入Spring配置文件
## 3、加入Hibernate
### 1）加入jar包
### 2）加入hibernate.cfg.xml，配置hibernate基本属性
### 3）建立持久化类，以及对应的hbm.xml文件
### 4）和Spring整合
## 4、加入Struts2
### 1）加入struts-core的jar包
### 2）在web.xml配置Struts2
### 3）加入Struts.xml的配置文件
### 4）跟Spring整合
* （1）加入Struts的Spring插件jar
* （2）在Spring的配置文件applicationContext-bean.xml里正常配置Action，scope="prototype"
* （3）在Struts.xml配置Action
## 5、功能实现
### 1）查询所有学生信息
### 2）删除学生的功能，删除前要给确认提示，删除后要给结果显示（AJAX）
### 3）添加学生（检测学生姓名是否已存在）
### 4）修改学生信息（检测学生姓名是否可用）





private StudentService studentService;
	private Map<String,Object>request;
	public StudentService getStudentService()
	{
		return studentService;
	}
	public void setStudentService(StudentService studentService)
	{
		this.studentService = studentService;
	}
	public String list()
	{
		request.put("student", studentService.getAll());
		return "list";
	}
	@Override
	public void setRequest(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub
		this.request=arg0;
	}