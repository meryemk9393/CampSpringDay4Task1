package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CandidateService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CandidateRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Candidate;

public class CandidateManager implements CandidateService {
	
	private CandidateRepository candidateRepository;

	public CandidateManager(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}

	@Override
	public List<Candidate> getAll() {
		// TODO Auto-generated method stub
		return candidateRepository.getAll();
	}
	
	public Candidate getById(Candidate candidate) {
		
		return candidate;
	}

}
