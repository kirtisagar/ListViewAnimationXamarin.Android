using System;
using Android.Widget;
using Android.Content;
using System.Collections.Generic;
using Android.Views;

namespace ListViewAnimationXamarinAndroid
{
	public class AnimationAdapter:Com.Nhaarman.Listviewanimations.ArrayAdapter
	{
		private Context mContext;
		private List<String> products;

		public AnimationAdapter (Context context, List<String> items):base(items)
		{

			products = items;
			mContext = context;
		}

		public override Android.Views.View GetView (int position, Android.Views.View convertView, Android.Views.ViewGroup parent)
		{
			LayoutInflater inflater = (LayoutInflater) mContext.GetSystemService(Context.LayoutInflaterService);


			View vi = convertView;
			if (vi == null)
				vi = inflater.Inflate(Resource.Layout.list_item, null);
			TextView name = (TextView) vi.FindViewById(Resource.Id.txtProductName);

			name.Text = products [position];
			return vi;
		}
	}
}

