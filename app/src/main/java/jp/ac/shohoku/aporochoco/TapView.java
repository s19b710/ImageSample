package jp.ac.shohoku.aporochoco;

 import android.content.Context;
 import android.content.res.Resources;
 import android.graphics.Bitmap;
 import android.graphics.BitmapFactory;
 import android.graphics.Canvas;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.util.AttributeSet;
 import android.view.MotionEvent;
 import android.view.View;

 /**
  * Created by utsumi on 2015/10/07.
  */
         public class TapView extends View {
 private Paint mPaint = new Paint(); //描画用のスタイル設定など
 private Bitmap mBmp1 = null; //表示用の Bitmap
 private Bitmap mBmp2 = null;
 private Bitmap mBmp3 = null;
 private int mTop, mLeft, mW, mH; //画像の幅と高さ

         /**
  * コンストラクタ
  * @param context
  * @param attrs
  */
         public TapView(Context context, AttributeSet attrs) {
             super(context, attrs);
             Resources rs = this.getResources(); //リソースを取得 (R クラスから取得)
             mBmp1 = BitmapFactory.decodeResource(rs, R.drawable.azisai); //リソースから画像を取得
             mBmp2 = BitmapFactory.decodeResource(rs, R.drawable.umi); //リソースから画像を取得
             mBmp3 = BitmapFactory.decodeResource(rs, R.drawable.batinki); //リソースから画像を取得
             mTop = 100;
             mLeft = 100;
         mW = mBmp1.getWidth();
         mH = mBmp2.getHeight();
         mH = mBmp3.getHeight();

         }

         /**
  * このメソッドで描画をします．
  *
  * @param canvas 画像表示用のキャンバス
  */




         /*
 * タップされたときに実行されるメソッド<br />
 * タップされたときに，押されたかどうかの状態をチェックし，変化させる．
 */
         @Override
public boolean onTouchEvent(MotionEvent event) {
         int x = (int) event.getX();
         int y = (int) event.getY();
         mLeft = x - mW/2; //描画場所を変更
        mTop = y - mH/2;

         invalidate(); //再描画する
         return super.onTouchEvent(event);
         }
 }
