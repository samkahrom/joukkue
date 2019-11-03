package com.example.joukkue.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.joukkue.domain.Joukkue;
import com.example.joukkue.domain.JoukkueRepository;

@Controller

public class JoukkueController {

	@Autowired
	private JoukkueRepository joukkuerepo;

	@RequestMapping(value = "/joukkuelist")
	public String joukkueList(Model model) {
		model.addAttribute("joukkueet", joukkuerepo.findAll());
		return "joukkuelist";
	}

	@RequestMapping(value = "/addjoukkue")
	public String addJoukkue(Model model) {
		model.addAttribute("joukkue", new Joukkue());
		return "addjoukkue";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Joukkue joukkue) {
		joukkuerepo.save(joukkue);
		return "redirect:/joukkuelist";
	}

	@RequestMapping(value = "/delete/{id}")
	public String deleteJoukkue(@PathVariable("id") Long joukkueId) {
		joukkuerepo.deleteById(joukkueId);
		return "redirect:../joukkuelist";
	}

	@RequestMapping(value = "/editjoukkue/{id}")
	public String editjoukkue(@PathVariable("id") Long joukkueId, Model model) {
		model.addAttribute("joukkue", joukkuerepo.findById(joukkueId));
		return "/editjoukkue";
	}

	@RequestMapping(value = "editjoukkue/save", method = RequestMethod.POST)
	public String saveEdit(Joukkue joukkue) {
		joukkuerepo.save(joukkue);
		return "redirect:/joukkuelist";
	}

}
