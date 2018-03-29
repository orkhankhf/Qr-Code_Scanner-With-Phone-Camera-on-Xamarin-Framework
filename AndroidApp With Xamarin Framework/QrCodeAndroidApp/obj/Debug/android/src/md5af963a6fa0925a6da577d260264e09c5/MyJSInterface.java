package md5af963a6fa0925a6da577d260264e09c5;


public class MyJSInterface
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("QrCodeAndroidApp.MyJSInterface, QrCodeAndroidApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyJSInterface.class, __md_methods);
	}


	public MyJSInterface ()
	{
		super ();
		if (getClass () == MyJSInterface.class)
			mono.android.TypeManager.Activate ("QrCodeAndroidApp.MyJSInterface, QrCodeAndroidApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MyJSInterface (android.content.Context p0)
	{
		super ();
		if (getClass () == MyJSInterface.class)
			mono.android.TypeManager.Activate ("QrCodeAndroidApp.MyJSInterface, QrCodeAndroidApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
