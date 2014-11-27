using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using System.Collections.Generic;
using Com.Nhaarman.Listviewanimations.Swinginadapters.Prepared;

namespace ListViewAnimationXamarinAndroid
{
	[Activity (Label = "ListViewAnimationXamarinAndroid", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : Activity
	{


		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);

			// Get our button from the layout resource,
			// and attach an event to it
		

			ListView lv = FindViewById<ListView>(Resource.Id.lv);
			AnimationAdapter mAdapter = new AnimationAdapter(this, GetProd());
			var AnimationAdapter = new SwingBottomInAnimationAdapter(mAdapter);

			AnimationAdapter.AbsListView = lv;

			lv.Adapter = AnimationAdapter;

		}

		private List<string> GetProd()
		{
			return new List<string> () {
				"item1",
				"item2",
				"item3",
				"item4",
				"item5",
				"item6",
				"item7",
				"item8",
				"item9",
				"item10",
				"item1",
				"item2",
				"item3",
				"item4",
				"item5",
				"item6",
				"item7",
				"item8",
				"item9",
				"item10"
			};
		}
	}
}


