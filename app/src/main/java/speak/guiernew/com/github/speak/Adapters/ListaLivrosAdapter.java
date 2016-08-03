package speak.guiernew.com.github.speak.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import speak.guiernew.com.github.speak.Classes.Livro;
import speak.guiernew.com.github.speak.R;

/**
 * Created by Guilherme on 27/07/2016.
 */
public class ListaLivrosAdapter extends BaseAdapter {

    ArrayList<Livro> lista;
    Context contexto;

    public ListaLivrosAdapter (ArrayList<Livro> lista, Context contexto){
        this.lista = lista;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_lista_livros,null);

        TextView textoNome = (TextView) view.findViewById(R.id.layout_lista_livros_textDescricao);
        TextView textoDescricao = (TextView) view.findViewById(R.id.layout_lista_livros_textNome);
        ImageView imagem = (ImageView) view.findViewById(R.id.layout_lista_livros_Imagem);

        Livro livro = lista.get(position);

        textoDescricao.setText(livro.getNome());
        textoNome.setText(livro.getDescricao());


        if (livro.getCodigo() == 1){
            imagem.setImageResource(R.drawable.download);
        }else if (livro.getCodigo() == 1){
            imagem.setImageResource(R.drawable.download);
        }else if (livro.getCodigo() == 1){
            imagem.setImageResource(R.drawable.download);
        }else {
            imagem.setImageResource(R.drawable.download);
        }


        return view;
    }

}
