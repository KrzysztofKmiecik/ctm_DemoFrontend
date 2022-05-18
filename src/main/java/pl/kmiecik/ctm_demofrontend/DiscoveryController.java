package pl.kmiecik.ctm_demofrontend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequiredArgsConstructor
class DiscoveryController {
    final private ServiceApi serviceApi;
    String packageId = "3313e90c-d1ef-11ec-9d64-0242ac120003";

    @GetMapping("/discoveries")
    public String getAllDiscoveries(Model model) {

        List<PackageDiscoveryDTO> packageDiscoveryDTOS = serviceApi.findByPackageId(packageId);

        model.addAttribute("allDiscoveries", packageDiscoveryDTOS);


        return "mainView";

    }

    @GetMapping("/search")
    public String showSearchEolt(Model model) {
        SearchDto searchDto = (SearchDto) model.getAttribute("searchStringAtribute");
        if (searchDto == null) {
            searchDto = new SearchDto();
        }
        List<PackageDiscoveryDTO> eoltDtos = serviceApi.findByPackageId(searchDto.getSearchString());
        model.addAttribute("searchStringForm", searchDto);
        model.addAttribute("searchStringListForm", eoltDtos);

        return "discoveries";
    }


    @PostMapping("/search")
    public String FindEolt(RedirectAttributes redirectAttributes, @ModelAttribute("searchDto") SearchDto searchDto) {
        packageId = searchDto.getSearchString();
        redirectAttributes.addFlashAttribute("searchStringAtribute", searchDto == null ? new SearchDto() : searchDto);
        return "redirect:/discoveries";
    }

    @PostMapping("/delete-discoveries")
    public String deleteFixture(@RequestParam String id,@RequestParam String packageId) {
        //  service.deleteFixture(Long.valueOf(id));
        serviceApi.deleteByPackageIdDiscoveryID(packageId,id);
        return "redirect:/discoveries";
    }

    @PostMapping("/add-discovery")
    public String addFixtureButton() {
        serviceApi.createNewDiscoveryForPackageId( packageId);

        return "redirect:/discoveries";
    }

    @ModelAttribute
    public SearchDto searchDto() {
        return new SearchDto();
    }


}
