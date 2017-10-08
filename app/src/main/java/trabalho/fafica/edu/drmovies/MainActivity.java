package trabalho.fafica.edu.drmovies;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        // Método que ativida o botão Up Navigation
//        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("DR MOVIES");
    }

    // Esse método da Activity infla o menu definido no XML ( menu_action_bar2.xml ) na ActionBar dessa Activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }//fim do optionMenu


    // Esse método da Activity é chamado sempre que um botão da ActionBar é clicado
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        // Estou verificando pelo Id do botão clicado se corresponde ao botão Up Navigation
//        if(item.getItemId()==android.R.id.home){
//            finish();
//            return true;
//        }

        // Estou verificando pelo Id do botão clicado se corresponde ao icon
        int id = item.getItemId();
        switch(id){

            case R.id.action_cadastrar:
                Toast.makeText(this, "Cadastrar", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.fragment_cadastro);

                break;

            case R.id.action_listar:
                Toast.makeText(this, "Listar", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.fragment_listar);

                break;

            case R.id.action_fechar:
                Toast.makeText(this, "** APLICAÇÃO ENCERRADA **", Toast.LENGTH_SHORT).show();
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);

    }//fim do onOptionItSelected


} //fim da classe
