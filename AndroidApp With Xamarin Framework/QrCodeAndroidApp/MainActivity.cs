using Android.App;
using Android.Widget;
using Android.OS;
using Android.Provider;
using Java.IO;
using Android.Graphics;
using Android.Content.PM;
using Uri = Android.Net.Uri;
using System.Collections.Generic;
using Android.Content;
using System;
using Android.Runtime;

namespace QrCodeAndroidApp
{
    [Activity(Label = "QrCodeAndroidApp", MainLauncher = true)]
    public class MainActivity : Activity
    {
        ImageView imageView;
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            // Set our view from the "main" layout resource  
            SetContentView(Resource.Layout.Main);
            var BtnTakeImg = FindViewById<Button>(Resource.Id.btnCamera);
            imageView = FindViewById<ImageView>(Resource.Id.imageView);
            BtnTakeImg.Click += TakeAPicture;
        }
        protected override void OnActivityResult(int requestCode, [GeneratedEnum] Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);
            Bitmap bitmap = (Bitmap)data.Extras.Get("data");
        }
        private void TakeAPicture(object sender, EventArgs e)
        {
            Intent intent = new Intent(MediaStore.ActionImageCapture);
            StartActivityForResult(intent, 0);
        }
    }
    class MyJSInterface : Java.Lang.Object
    {
        Context context;

        public MyJSInterface(Context context)
        {
            this.context = context;
        }

        public void ShowToast()
        {
            Toast.MakeText(context, "Hello from C#", ToastLength.Short).Show();
        }
    }
}

