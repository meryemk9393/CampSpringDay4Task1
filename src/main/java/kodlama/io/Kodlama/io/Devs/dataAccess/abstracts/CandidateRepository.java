package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Candidate;



public interface CandidateRepository {
	
	List<Candidate> getAll();

}
