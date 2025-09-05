import java.utils.List;
import java.utils.ArrayList;
public class AlunoService {
    private list<Aluno> alunos=new ArrayList<>();
    public list<Aluno> listarTodos(){
        return alunos;
    }

    public Aluno buscarPorId(Long id){
        for(Aluno aluno:alunos){
            if(aluno.Getid().equals(id)){
                return aluno;
            }
            else{
                return "ID ou aluno não encontrado.";
            }

        }
    }

    public addAluno(Aluno aluno){
        if(Aluno==null){
         set   
        }
    }
}
