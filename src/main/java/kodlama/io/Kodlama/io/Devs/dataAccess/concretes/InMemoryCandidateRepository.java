package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CandidateRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Candidate;



public class InMemoryCandidateRepository implements CandidateRepository{

	
	
List<Candidate> candidates;
	
	public InMemoryCandidateRepository() {
		candidates=new ArrayList<Candidate>();
		for(Candidate candidate1:candidates)
		{
			if(!candidate1.getName()=Candidate.getName()&& !candidate1.getLang()=null)
				
		{candidates.add(new Candidate(1,"Meryem","Kose",null));
		candidates.add(new Candidate(2,"Meltem","Kose",null));
		candidates.add(new Candidate(3,"Mehmet","Kose", null));
		
	}}}

	@Override
	public List<Candidate> getAll() {


		return candidates;
	}
}
