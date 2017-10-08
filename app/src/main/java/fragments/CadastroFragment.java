package fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;

import trabalho.fafica.edu.drmovies.R;


public class CadastroFragment extends Fragment {


    private static Button cadastro;
    private CheckBox cbAcao;
    private CheckBox cbAventura;
    private CheckBox cbDrama;
    private CheckBox cbSuspense;
    private CheckBox cbAnimacao;
    private CheckBox cbTerror;
    private CheckBox cbComedia;
    private CheckBox cbFiccao;
    private ArrayList<String> generosCadastrados;
    private EditText edTitulo;
    private EditText edAtores;
    private EditText edPersonagem;
    private EditText edAnoLanc;
    private AutoCompleteTextView AutCompNome;
    private AutoCompleteTextView AutCompPais;


    final String[] nomes = new String[] { "Alex", "Afonso", "Ademir", "Luis Inácio", "Bruno", "Bruna", "Carlos", "Carina", "Diego", "Dyego Lemos", "Danilo", "Eduardo", "Fernando Henrique",
            "Edilson", "Fernando", "Fabio", "Guilherme", "Gilson", "Tiago", "Tadeu", "Jose Serra", "Carlos Apolinario", "Amadeu Aguiar"};

    final  String[] paises = new String[] {"Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda",
            "Antilhas Neerlandesas", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria",
            "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana",
            "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre",
            "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia",
            "Cuba", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia",
            "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia",
            "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk",
            "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "lhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas",
            "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia",
            "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali",
            "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "Mayotte", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate",
            "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean",
            "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia",
            "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Checa", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana",
            "Santa Helena", "Santa Lúcia", "São Cristóvão e Neves", "São Marinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal",
            "Serra Leoa", "Sérvia", "Singapura", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia",
            "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão",
            "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"};


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //componentes

        cbAcao = (CheckBox) cbAcao.findViewById(R.id.cbAcao);
        cbAventura = (CheckBox) cbAventura.findViewById(R.id.cbAventura);
        cbDrama = (CheckBox) cbDrama.findViewById(R.id.cbDrama);
        cbSuspense = (CheckBox) cbSuspense.findViewById(R.id.cbSuspense);
        cbAnimacao = (CheckBox) cbAnimacao.findViewById(R.id.cbAnimacao);
        cbTerror = (CheckBox) cbTerror.findViewById(R.id.cbTerror);
        cbComedia = (CheckBox) cbComedia.findViewById(R.id.cbComedia);
        cbFiccao = (CheckBox) cbFiccao.findViewById(R.id.cbFiccao);

        final ArrayList<String> generosCadastrados = new ArrayList<String>();

        edTitulo = (EditText) edTitulo.findViewById(R.id.edtTitulo);
        edAtores = (EditText) edAtores.findViewById(R.id.edtAtores);
        edPersonagem = (EditText) edPersonagem.findViewById(R.id.edtPersonagem);
        edAnoLanc = (EditText) edAnoLanc.findViewById(R.id.edtAnoLanc);


        //AUTO COMPLETE NOME
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, nomes);
        AutCompNome = (AutoCompleteTextView) AutCompNome.findViewById(R.id.autoCompleteTextViewNome);
        AutCompNome.setThreshold(1);
        AutCompNome.setAdapter(adapter);
        AutCompNome.setTextColor(Color.BLUE);

        //AUTO COMPLETE PAíS
        ArrayAdapter<String> adapterPais = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, paises);
        AutCompPais = (AutoCompleteTextView) AutCompPais.findViewById(R.id.autoCompleteTextViewPais);
        AutCompPais.setThreshold(1);
        AutCompPais.setAdapter(adapterPais);
        AutCompPais.setTextColor(Color.BLUE);

        final AutoCompleteTextView finalAutCompNome = AutCompNome;
        final AutoCompleteTextView finalAutCompPais = AutCompPais;


        cadastro = (Button) cadastro.findViewById(R.id.btCadastarFilme);

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ListarFragment.class);

                Bundle bundle = new Bundle();


                String txtNome = finalAutCompNome.getText().toString();
                bundle.putString("nome",txtNome );

                String pais = finalAutCompPais.getText().toString();
                bundle.putString("pais", pais);

                String generos = "";

                if(cbAcao.isChecked()){
                    bundle.putString("genero1", cbAcao.getText().toString());
                    generos = " Ação ";
                    generosCadastrados.add(generos);
                }

                if(cbAventura.isChecked()){
                    bundle.putString("genero2", cbAventura.getText().toString());
                    generos = " Aventura ";
                    generosCadastrados.add(generos);
                }

                if(cbDrama.isChecked()){
                    bundle.putString("genero3", cbDrama.getText().toString());
                    generos= " Drama ";
                    generosCadastrados.add(generos);
                }

                if(cbSuspense.isChecked()){
                    bundle.putString("genero4", cbSuspense.getText().toString());
                    generos = " Suspense ";
                    generosCadastrados.add(generos);
                }

                if(cbAnimacao.isChecked()){
                    bundle.putString("genero5", cbAnimacao.getText().toString());
                    generos = "Animação ";
                    generosCadastrados.add(generos);
                }

                if(cbTerror.isChecked()){
                    bundle.putString("genero6", cbTerror.getText().toString());
                    generos = " Terror ";
                    generosCadastrados.add(generos);
                }

                if(cbComedia.isChecked()){
                    bundle.putString("genero7", cbComedia.getText().toString());
                    generos= " Comédia ";
                    generosCadastrados.add(generos);
                }

                if(cbFiccao.isChecked()){
                    bundle.putString("genero8", cbFiccao.getText().toString());
                    generos = " Ficção ";
                    generosCadastrados.add(generos);
                }

                bundle.putStringArrayList("generosCadastrados", generosCadastrados);


                String titulo = edTitulo.getText().toString();
                bundle.putString("titulo", titulo);

                String atores = edAtores.getText().toString();
                bundle.putString("atores", atores);

                String personagem = edPersonagem.getText().toString();
                bundle.putString("personagem", personagem);

                String anoLanc = edAnoLanc.getText().toString();
                bundle.putString("anoLanc", anoLanc);

            }// fim do setOnClick
        });// fim do setOnClickListener


    }// fim do onCreate

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cadastro, container, false);


    }// fim do onCreateView


}// fim da classe
