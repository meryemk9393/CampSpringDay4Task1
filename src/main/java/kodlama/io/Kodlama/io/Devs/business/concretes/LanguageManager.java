package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CandidateRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Candidate;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;

public LanguageManager(LanguageRepository languageRepository) {
	super();
	this.languageRepository = languageRepository;
}

@Override
public List<Language> getAll() {
	// TODO Auto-generated method stub
	return languageRepository.getAll();
}

public Language getById(Language lang) {
	
	return lang;
}

}
