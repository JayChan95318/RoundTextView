##支持设置圆角的TextView

支持分别设置左上、右上、左下、右下的圆角大小

###效果图:

   ![](https://i.imgur.com/Q9XqJb3.jpg)

    

## 如何使用

   在项目根目录下的build.gradle中的allprojects{}中，添加jitpack仓库地址，如下：

    allprojects {
	    repositories {
	        jcenter()
	        maven { url 'https://jitpack.io' }//添加jitpack仓库地址
	    }
    }


   打开app的module中的build.gradle，在dependencies{}中，添加依赖，如下：


    dependencies {
        ......
          compile 'com.github.JayChan95318:MultipleTextView:1.0'
    }


##参数说明
    
    app:tvBackgroundColor   背景颜色(如果需要设置背景颜色的话必须设置该属性,不能用android:background代替)
    app:tvBorderWidth    边框线的大小
    app:tvBorderColor    边框线的颜色
    app:tvCornerRadius   四个边的圆角大小(四个边的大小都相等的时候用这个就行了)
    app:tvTopLeftRadius   左上边的圆角大小
    app:tvTopRightRadius   右上边的圆角大小
    app:tvBottomLeftRadius   左下边的圆角大小
    app：tvBottomRightRadius   右下边的圆角大熊啊


##效果图布局代码

    <?xml version="1.0" encoding="utf-8"?>
    
    <LinearLayout
		    xmlns:android="http://schemas.android.com/apk/res/android"
		    xmlns:app="http://schemas.android.com/apk/res-auto"
		    android:layout_width="match_parent"
		    android:layout_height="match_parent"
		    android:gravity="center_horizontal"
		    android:orientation="vertical">

    <com.jaychan.library.view.RoundTextView
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_centerInParent="true"
	        android:layout_marginTop="30dp"
	        android:paddingBottom="8dp"
	        android:paddingLeft="12dp"
	        android:paddingRight="12dp"
	        android:paddingTop="8dp"
	        android:text="示例样式1"
	        android:textColor="#ffffff"
	        android:textSize="12sp"
	        app:tvBackgroundColor="#73A5F0"
	        app:tvCornerRadius="5dp"/>

    <com.jaychan.library.view.RoundTextView
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_centerInParent="true"
	        android:layout_marginTop="10dp"
	        android:paddingBottom="8dp"
	        android:paddingLeft="12dp"
	        android:paddingRight="12dp"
	        android:paddingTop="8dp"
	        android:text="示例样式2"
	        android:textColor="#73A5F0"
	        android:textSize="12sp"
	        app:tvBackgroundColor="#ffffff"
	        app:tvBorderColor="#73A5F0"
	        app:tvBorderWidth="1dp"
	        app:tvCornerRadius="5dp"/>


    <com.jaychan.library.view.RoundTextView
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_centerInParent="true"
	        android:layout_marginTop="10dp"
	        android:paddingBottom="8dp"
	        android:paddingLeft="12dp"
	        android:paddingRight="12dp"
	        android:paddingTop="8dp"
	        android:text="示例样式3"
	        android:textColor="#ffffff"
	        android:textSize="12sp"
	        app:tvBackgroundColor="#73A5F0"
	        app:tvCornerRadius="20dp"/>

    <com.jaychan.library.view.RoundTextView
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_centerInParent="true"
	        android:layout_marginTop="10dp"
	        android:paddingBottom="8dp"
	        android:paddingLeft="12dp"
	        android:paddingRight="12dp"
	        android:paddingTop="8dp"
	        android:text="示例样式4"
	        android:textColor="#73A5F0"
	        android:textSize="12sp"
	        app:tvBackgroundColor="#ffffff"
	        app:tvBorderColor="#73A5F0"
	        app:tvBorderWidth="1dp"
	        app:tvCornerRadius="20dp"/>

    <LinearLayout
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_marginTop="10dp"
	        android:orientation="horizontal">

        <com.jaychan.library.view.RoundTextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:paddingBottom="8dp"
            android:paddingLeft="12dp"
            android:paddingRight="12dp"
            android:paddingTop="8dp"
            android:text="示例样式5"
            android:textColor="#73A5F0"
            android:textSize="12sp"
            app:tvBackgroundColor="#ffffff"
            app:tvBorderColor="#73A5F0"
            app:tvBorderWidth="1dp"
            app:tvBottomLeftRadius="5dp"
            app:tvTopLeftRadius="5dp"/>

        <com.jaychan.library.view.RoundTextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:paddingBottom="8dp"
            android:paddingLeft="12dp"
            android:paddingRight="12dp"
            android:paddingTop="8dp"
            android:text="示例样式6"
            android:textColor="#ffffff"
            android:textSize="12sp"
            app:tvBackgroundColor="#73A5F0"
            app:tvBottomRightRadius="5dp"
            app:tvCornerRadius="5dp"
            app:tvTopRightRadius="5dp"/>



    </LinearLayout>

    </LinearLayout>

 
    
  

