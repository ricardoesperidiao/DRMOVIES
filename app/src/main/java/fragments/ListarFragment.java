package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import trabalho.fafica.edu.drmovies.R;


public class ListarFragment extends Fragment {

    private  String nome = "Título do Filme - ";

    private ArrayAdapter<String> adpDados;
    private ListView lstDadosCadastrados;
    private Bundle params;


    private ArrayList<String> listaFilmes = new ArrayList<String>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent it = getIntent();
//        params = it.getExtras();

//        nome += params.getString("nome");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listar, container, false);
        ListView listViewFilmes = (ListView) view.findViewById(R.id.list_view_filmes);
//        listViewFilmes.setAdapter(new PaisesAdapter(getActivity()));
//        listViewFilmes.setOnItemClickListener(onItemClickPais());

        return view;
    }



}
