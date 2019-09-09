package student.jnu.com.myfirstapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.security.auth.PrivateCredentialPermission;

/**
 * Created by chen on 2019/9/9.
 */

public class button_main_activity extends AppCompatActivity {
    class ENGclick implements View.OnClickListener
    {
        public void onClick(View ENG)
        {
            poemtxt.setText(R.string.poemEN);
        }
    }
    class CHNclick implements View.OnClickListener
    {
        public void onClick(View CHN)
        {
            poemtxt.setText(R.string.poemCH);
        }
    }
    private TextView poemtxt;
    private Button ButtonCHN;
    private Button ButtonENG;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_main_activity);
        poemtxt=(TextView)findViewById(R.id.textlalala);
        ButtonCHN=(Button)findViewById(R.id.buttonCHN);
        ButtonENG=(Button)findViewById(R.id.buttonENG);
        ButtonENG.setOnClickListener(new ENGclick());
        ButtonCHN.setOnClickListener(new CHNclick());




        //通过id获取textview空间并且修改文本



    }
}
