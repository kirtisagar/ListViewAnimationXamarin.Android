package listviewanimationxamarinandroid;


public class AnimationAdapter
	extends com.nhaarman.listviewanimations.ArrayAdapter
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\n" +
			"";
		mono.android.Runtime.register ("ListViewAnimationXamarinAndroid.AnimationAdapter, ListViewAnimationXamarinAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AnimationAdapter.class, __md_methods);
	}


	public AnimationAdapter (java.util.List p0, boolean p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == AnimationAdapter.class)
			mono.android.TypeManager.Activate ("ListViewAnimationXamarinAndroid.AnimationAdapter, ListViewAnimationXamarinAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Collections.IList, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public AnimationAdapter (java.util.List p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AnimationAdapter.class)
			mono.android.TypeManager.Activate ("ListViewAnimationXamarinAndroid.AnimationAdapter, ListViewAnimationXamarinAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Collections.IList, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public AnimationAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AnimationAdapter.class)
			mono.android.TypeManager.Activate ("ListViewAnimationXamarinAndroid.AnimationAdapter, ListViewAnimationXamarinAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public android.view.View getView (int p0, android.view.View p1, android.view.ViewGroup p2)
	{
		return n_getView (p0, p1, p2);
	}

	private native android.view.View n_getView (int p0, android.view.View p1, android.view.ViewGroup p2);

	java.util.ArrayList refList;
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
